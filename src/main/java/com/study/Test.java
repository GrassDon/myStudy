package com.study;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.concurrent.ConcurrentHashMap;

/**
 * <p>
 * 说明：
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2020/2/27 16:38
 */
public class Test {
    public static void main (String[] args) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Person.xml");
        Person person1 = (Person) applicationContext.getBean("person");*/
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("Person.xml"));
        Person person = (Person) beanFactory.getBean("person");
        System.out.println(person.getName());
    }
}
