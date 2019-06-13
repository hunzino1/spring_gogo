package com.shj.main;

import com.shj.pojo.TestBeanClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @create 2019/6/13
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        TestBeanClass bean = (TestBeanClass) context.getBean("TestBeanClass");
        bean.setId(15);
        System.out.println(bean.getId());
    }
}
