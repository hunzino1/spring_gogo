package com.shj.generic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Service {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
        /**
         * Configuration注解应该同component一样，在容器中自动注册了
         * 所以我在用@Bean的时候就报冲突了，除非指定个其他的name
         */
        StoreConfig storeConfig = (StoreConfig) context.getBean("storeConfig");
        storeConfig.testGeneric();
    }
}
