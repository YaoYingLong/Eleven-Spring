package com.eleven.icode.ispring.aop.earlyAop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

/**
 * @author by YingLong on 2021/9/26
 */
public class ElevenLogInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println(getClass() + "调用方法前");
        Object ret = invocation.proceed();
        System.out.println(getClass() + "调用方法后");
        return ret;
    }
}
