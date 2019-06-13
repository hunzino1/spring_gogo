package com.shj.main;

import com.shj.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @create 2019/6/13
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        User user = (User) context.getBean("user");
        user.setId(12);
        user.setName("shj");
        System.out.println(user.toString());
    }
}
