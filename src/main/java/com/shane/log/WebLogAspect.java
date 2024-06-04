package com.shane.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WebLogAspect {
    @Pointcut("execution(* *..*Controller.*(..))")
    public void webLog(){}

    @Before("webLog()")
    public void before(JoinPoint joinPoint) {
        System.out.println("shane-starter ------before");
    }

    @After("webLog()")
    public void after(JoinPoint joinPoint){
        System.out.println("shane-starter ------after");
    }
}
