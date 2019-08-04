package com.shj.main;

import com.shj.aop.schema.advice.biz.AspectBiz;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        AspectBiz aspectBiz = (AspectBiz) context.getBean("aspectBiz");
        aspectBiz.biz();
    }
}
