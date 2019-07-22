package com.shj.main;

import com.shj.pojo.TestClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Service {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        TestClass testClass = (TestClass) context.getBean("testClass");
        testClass.say();
    }
}
