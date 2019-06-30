package com.shj.main;

import com.shj.pojo.ResourceBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @create 2019/6/30
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        ResourceBean resourceBean = (ResourceBean) context.getBean("resourceBean");
        try {
            resourceBean.getResource("classpath:file/test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
