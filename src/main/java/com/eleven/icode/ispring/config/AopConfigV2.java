package com.eleven.icode.ispring.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author by YingLong on 2021/9/22
 */
//@Aspect
//@Component
public class AopConfigV2 {

    @Pointcut(value = "execution(* com.eleven.icode.ispring.service.impl.Car.init(..))")
    private void pointCut() {
    }

    @AfterThrowing(value = "pointCut()")
    public void methodAfterThrowing(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("2执行目标方法【"+methodName+"】的<异常通知>,入参"+Arrays.asList(joinPoint.getArgs()));
    }

    @Before(value = "pointCut()")
    public void methodBefore(JoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("2执行目标方法【"+methodName+"】的<前置通知>,入参"+ Arrays.asList(joinPoint.getArgs()));
    }

    @AfterReturning(value = "pointCut()",returning = "result")
    public void methodReturning(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("2执行目标方法【"+methodName+"】的<返回通知>,入参"+Arrays.asList(joinPoint.getArgs()));
    }


    @After(value = "pointCut()")
    public void methodAfter(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("2执行目标方法【"+methodName+"】的<后置通知>,入参"+Arrays.asList(joinPoint.getArgs()));
    }

}
