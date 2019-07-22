package com.shj.pojo;

import org.springframework.stereotype.Component;

@Component
public class BeanClassTwo implements BeanInterface {
    @Override
    public void say() {
        System.out.println("this is class two");
    }
}
