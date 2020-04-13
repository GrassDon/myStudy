package com.study;

import com.study.Beans.PersonConfig;
import com.study.service.bookService;
import com.study.service.myService;
import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p>
 * 说明：spring源码阅读入口，简单的入口类，却包括spring的xml配置文件加载，bean创建等全部功能。
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2020/2/27 16:38
 */
public class Test {
    public static void main (String[] args) throws IOException {
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Person.xml");
        Person person1 = (Person) applicationContext.getBean("person");*/

        /**
         * 可以通过Resource获取classpath资源文件，然后获取inputstream，
         * 进而可以用平常的io操作来读取input stream。
         * 确切地说，有了resource接口，便可以对所有资源文件进行统一处理了。
         */
        /*Resource resource = new ClassPathResource("Person.xml");
        InputStream inputStream = resource.getInputStream();
        int size = (int) resource.contentLength();
        byte[] bytes = new byte[size];
        inputStream.read(bytes);
        inputStream.close();
        System.out.println(new String(bytes));*/

        //这一行代码主要包括了BeanDefinition的注册，默认/自定义标签的解析与注册，bean的加载
        //BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("Person.xml"));
        //bean的创建及获取
        //Person person = (Person) beanFactory.getBean("person");

        //注解形式
        /*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
        Person person = (Person)context.getBean("person");
        System.out.println(person.getName());*/

        //注解形式获取service
        AnnotationConfigApplicationContext serviceContext = new AnnotationConfigApplicationContext(myService.class);
        myService myService = (myService)serviceContext.getBean("myService");
        myService.play();
    }
}
