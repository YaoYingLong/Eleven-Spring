package com.eleven.icode.ispring.config;

import com.eleven.icode.ispring.service.Tank;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;

/**
 * Created by xsls on 2019/8/15.
 */
@Configuration
@ComponentScan(basePackages = {"com.eleven.icode.ispring"})
//excludeFilters={@ComponentScan.Filter(type=FilterType.ANNOTATION,value={Controller.class})})
public class MainConfig {

    //    @Bean(value = "car")
//    public Car car(){
//        Car car = new Car();
//        car.setName("testCar");
//        car.setTank(tank());
//        car.setTank2(tank());
//        // 如果不去ioc 容器中拿   是不是每次都会创建新的
//        // 都会先根据方法名  getBean("car")
//        System.out.println("Car通过@Bean注册Bean");
//        return car;
//    }
//
//    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
//    public Tank tank() {
//        System.out.println("Tank通过@Bean注册Bean");
//        return new Tank();
//    }

//    @Bean(name = "applicationEventMulticaster")
//    public ApplicationEventMulticaster simpleApplicationEventMulticaster() {
//        SimpleApplicationEventMulticaster eventMulticaster = new SimpleApplicationEventMulticaster();
//        eventMulticaster.setTaskExecutor(new SimpleAsyncTaskExecutor());
//        return eventMulticaster;
//    }
}
