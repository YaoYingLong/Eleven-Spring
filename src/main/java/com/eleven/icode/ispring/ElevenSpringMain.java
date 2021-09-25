package com.eleven.icode.ispring;

import com.eleven.icode.ispring.config.MainConfig;
import com.eleven.icode.ispring.event.ElevenEvent;
import com.eleven.icode.ispring.service.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author by YingLong on 2021/9/21
 */
public class ElevenSpringMain {
    public static void main(String[] args) {
        // 加载spring上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        context.publishEvent(new ElevenEvent(context, "test"));
    }
}
