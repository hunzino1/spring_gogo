package com.shj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @create 2019/6/27
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        /**
         * 方式一： 实现接口，重写方法afterPropertiesSet
         */
//        context.getBean("initBean");
        /**
         * 方式二： bean维度上(xml文件)配置一个初始化方法
         */
//        context.getBean("initXML");
        /**
         * 方式三： 全局配置默认的初始化方法
         */
//        context.getBean("defaultInit");

        /**
         * 方式一： 实现接口，重新destroy
         */
        context.getBean("destroyBean");

    }
}
