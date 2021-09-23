package com.eleven.icode.ispring.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author by YingLong on 2021/9/22
 */
@Aspect
@Component
@EnableAspectJAutoProxy
public class AopConfig {

    @Pointcut(value = "execution(* com.eleven.icode.ispring.service.Car.transfer(..))")
    private void demo() {  // 切点签名方法
        System.out.println("Aop demo...");
    }

    @Before(value = "demo()")
    public void before(JoinPoint jp) {
        System.out.println("Aop Before...");
    }

}
