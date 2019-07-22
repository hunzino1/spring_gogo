package com.shj.pojo;

import org.springframework.stereotype.Component;

@Component
public class BeanClassOne implements BeanInterface {

    @Override
    public void say() {
        System.out.println("this is class one");
    }
}
