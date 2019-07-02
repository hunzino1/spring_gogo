package com.shj.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutowiredBean {
    public void say() {
        System.out.println("autowired bean");
    }

}
