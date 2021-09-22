package com.eleven.icode.ispring;

import com.eleven.icode.ispring.config.MainConfig;
import com.eleven.icode.ispring.service.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author by YingLong on 2021/9/21
 */
public class ElevenSpringMain {
    public static void main(String[] args) {
        // 加载spring上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        Object obj = context.getBean("elevenFactoryBean");
        System.out.println(obj.getClass().getName());
        {
            Car car = (Car) context.getBean("car");
            System.out.println(car.getName());
            System.out.println(car.getTank());
            System.out.println(car.getTank2());
        }
    }
}
