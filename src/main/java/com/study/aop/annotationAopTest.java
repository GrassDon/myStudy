package com.study.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 说明：注解切面类，用于对某个特定注解进行切面，并获取并处理该注解注释的方法或者类的相关信息
 * <li></li>
 * </p>
 *
 * @author dongzzh
 * @date 2019/10/21 17:09
 */
@Component
@Aspect
public class annotationAopTest {
    @Pointcut("@annotation(com.study.annotation.myfirstAnnotation)")
    public void pointcut(){}

    @Before(value = "pointcut()")
    public void before(JoinPoint joinPoint){
        System.out.println("注解标记的测试方法为："+joinPoint.getSignature().getName());
    }

    /**
     * 可以通过环绕切面来增强方法，进行方法参数的修改
     * @param proceedingJoinPoint
     * @return
     * @throws Throwable
     */
    @Around(value = "pointcut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        Object[] object = proceedingJoinPoint.getArgs();
        object[0] = 2;
        Object reobject = proceedingJoinPoint.proceed(object);
        return reobject;
    }

    @After(value = "pointcut()")
    public void after(JoinPoint joinPoint){
    }
}
