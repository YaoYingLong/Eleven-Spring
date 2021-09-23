package com.eleven.icode.ispring.config;

import com.eleven.icode.ispring.service.Car;
import com.eleven.icode.ispring.service.Tank;
import org.springframework.context.annotation.*;

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
//    @Bean(initMethod = "initMethod")
//    public Tank tank(){
//        System.out.println("Tank通过@Bean注册Bean");
//        return new Tank();
//    }
}
