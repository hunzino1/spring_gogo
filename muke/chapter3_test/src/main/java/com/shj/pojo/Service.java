package com.shj.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Service {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        TestBean testBean = (TestBean) context.getBean("testBean");
        testBean.resource("file/test.txt");
    }
}
