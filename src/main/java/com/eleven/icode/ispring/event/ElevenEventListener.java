package com.eleven.icode.ispring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author by YingLong on 2021/9/25
 */
@Lazy
@Component
public class ElevenEventListener implements ApplicationListener<ElevenEvent> {
    @Override
    public void onApplicationEvent(ElevenEvent event) {
        System.out.println(Thread.currentThread().getName() + ", Interface：" + event.getName());
    }
}
