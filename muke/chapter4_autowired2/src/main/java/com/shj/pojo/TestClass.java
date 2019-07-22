package com.shj.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TestClass {
    @Autowired
    private List<BeanInterface> beanInterfaceList;

    public void say() {
        for (BeanInterface beanInterface : beanInterfaceList) {
            beanInterface.say();
        }
    }
}
