package com.shj.main;

import com.shj.pojo.RequireBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Service {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        RequireBean requireBean = (RequireBean) context.getBean("requireBean");
        context.getBean("mainBean");
    }
}
