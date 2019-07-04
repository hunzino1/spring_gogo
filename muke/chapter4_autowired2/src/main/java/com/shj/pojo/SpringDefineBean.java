package com.shj.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class SpringDefineBean {
    @Autowired
    private ApplicationContext applicationContext;

    public void doSpmthing() {
        this.applicationContext.getBean("");
    }
}
