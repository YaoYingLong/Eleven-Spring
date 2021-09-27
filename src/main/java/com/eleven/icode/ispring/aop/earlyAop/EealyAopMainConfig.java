package com.eleven.icode.ispring.aop.earlyAop;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;
import org.springframework.aop.support.RegexpMethodPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author by YingLong on 2021/9/26
 */
//@Configuration
public class EealyAopMainConfig {
    @Bean
    public Calculate elevenCalculate() {
        return new ElevenCalculate();
    }

    @Bean
    public ElevenLogAdvice elevenLogAdvice() {
        return new ElevenLogAdvice();
    }

    @Bean
    public ElevenLogInterceptor elevenLogInterceptor() {
        return new ElevenLogInterceptor();
    }

    @Bean
    public ProxyFactoryBean calculateProxy() {
        ProxyFactoryBean userService = new ProxyFactoryBean();
        userService.setInterceptorNames("elevenLogAdvice", "elevenLogInterceptor");  // 根据指定的顺序执行
        userService.setTarget(elevenCalculate());
        return userService;
    }

//    @Bean
//    public NameMatchMethodPointcutAdvisor elevenLogAspect() {
//        NameMatchMethodPointcutAdvisor advisor = new NameMatchMethodPointcutAdvisor();
//        advisor.setAdvice(elevenLogAdvice());
//        advisor.setMappedNames("div");
//        return advisor;
//    }

    @Bean
    public ProxyFactoryBean calculateAdvisorProxy() {
        ProxyFactoryBean userService = new ProxyFactoryBean();
        userService.setInterceptorNames("elevenLogAspect");
        userService.setTarget(elevenCalculate());
        return userService;
    }

    //    @Bean
//    public BeanNameAutoProxyCreator autoProxyCreator() {
//        BeanNameAutoProxyCreator beanNameAutoProxyCreator = new BeanNameAutoProxyCreator();
//        // 设置要创建代理的那些Bean的名字
//        beanNameAutoProxyCreator.setBeanNames("eleven*");
//        // 设置拦截链名字(这些拦截器是有先后顺序的)
//        beanNameAutoProxyCreator.setInterceptorNames("elevenLogInterceptor");
//        return beanNameAutoProxyCreator;
//    }
//    @Bean
//    public RegexpMethodPointcutAdvisor tulingLogAspectInterceptor() {
//        RegexpMethodPointcutAdvisor advisor = new RegexpMethodPointcutAdvisor();
//        advisor.setAdvice(elevenLogInterceptor());
//        advisor.setPattern("com.eleven.*");
//        return advisor;
//    }
//
//    @Bean
//    public DefaultAdvisorAutoProxyCreator autoProxyCreator() {
//        return new DefaultAdvisorAutoProxyCreator();
//    }
}
