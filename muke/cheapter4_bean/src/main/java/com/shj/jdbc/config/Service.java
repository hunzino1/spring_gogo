package com.shj.jdbc.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class Service {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        MyDriveManager myDriveManager = (MyDriveManager) context.getBean("myDriveManager");

    }
}
