package com.shj.main;

import com.shj.pojo.AutowiringBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @create 2019/6/28
 */
public class Service {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        AutowiringBean autowiringBean = (AutowiringBean) context.getBean("autowiringBean");
        autowiringBean.say();
    }

}
