package com.eleven.icode.ispring.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author by YingLong on 2021/9/25
 */
public class ElevenEvent extends ApplicationEvent {
    private String name;
    public ElevenEvent(Object source, String name) {
        super(source);
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
