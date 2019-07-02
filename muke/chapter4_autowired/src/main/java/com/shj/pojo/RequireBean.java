package com.shj.pojo;

import org.springframework.stereotype.Service;

@Service
public class RequireBean {
    public void say() {
        System.out.println("require bean");
    }
}
