package com.eleven.icode.ispring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author by YingLong on 2021/9/25
 */
//@Component
public class ElevenEventAnnotationListener {
    @EventListener(value = ElevenEvent.class)
    public void onApplicationEvent(ElevenEvent event) {
        System.out.println(Thread.currentThread().getName() + ", Annotation：" + event.getName());
    }
}
