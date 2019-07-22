package com.study.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import javax.servlet.http.HttpServletRequest;

@Component
@Aspect
public class aopTest {
    //定义切点方法,用这个方法去切
    /*
    * 这个方法好比一个探针，插入某个方法中，此后的aop中，便以这个探针方法为标准，
    * 以这个方法所切的类或者方法为参照，定义前后或者环绕。
    * 第一个*代表方法返回任意值，第二个*表示表示service包下的任意类，第三个*表示任意方法。
    * 括号中的两个点，表示任意参数。
    * */
    @Pointcut("execution(* com.study.service.*.*(..))")
    public void pointcut(){

    }
    /*
    * 前置通知，表示在目标方法执行之前。
    * 其中joinpoint为连接点，即类里面可以被增强的方法，即想获得相关信息的方法，通过这个类，即可获取到目标方法的相关信息
    * 比如方法名，参数等等。
    * */
    @Before(value="pointcut()")
    public void before(JoinPoint joinPoint){
        //获取目标方法的名称
        String name = joinPoint.getSignature().getName();
        //获取目标方法的参数
        Object[] objects = joinPoint.getArgs();
        for(Object o:objects)
        {
            System.out.println("获取目标方法的参数："+o.toString());
        }
        //aop代理类的信息
        joinPoint.getThis();
        //代理的目标对象
        System.out.println("获取代理的目标对象："+joinPoint.getTarget().toString());
        //获取RequestAttributes
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        //从获取RequestAttributes中获取HttpServletRequest的信息
        HttpServletRequest request = (HttpServletRequest) requestAttributes.resolveReference(RequestAttributes.REFERENCE_REQUEST);
        //如果要获取Session信息的话，可以这样写：
        //HttpSession session = (HttpSession) requestAttributes.resolveReference(RequestAttributes.REFERENCE_SESSION);
        System.out.println(name+"方法开始执行。。。");
    }
    @After(value = "pointcut()")
    public void after(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法已经执行。。。");
    }
    @AfterReturning(value = "pointcut()",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result)
    {
        String name =joinPoint.getSignature().getName();
        System.out.println(name+"方法返回值为："+result);
    }
    @AfterThrowing(value = "pointcut()",throwing = "e")
    public void afterThrowing(JoinPoint joinPoint,Exception e)
    {
        String name = joinPoint.getSignature().getName();
        System.out.println(name+"方法抛出的异常是:"+e.getMessage());
    }
    /*
    * 环绕通知，所有通知里功能最强的一个通知，可以实现以上三个通知，
    * 目标方法进入环绕通知后，通过proceedingjoinpoint对象的proceed方法，使目标继续执行
    * 开发者可以修改目标方法的执行参数、返回值等。
    * */
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        return proceedingJoinPoint.proceed();
    }
}
