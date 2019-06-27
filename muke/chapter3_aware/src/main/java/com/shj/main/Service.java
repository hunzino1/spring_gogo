package com.shj.main;

import com.shj.pojo.ApplicationContextAwareBean;
import com.shj.pojo.BeanNameAwareBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @create 2019/6/27
 */
public class Service {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        System.out.println("++ classpath ++" + context.hashCode());
        ApplicationContextAwareBean applicationContextAwareBean = (ApplicationContextAwareBean)context.getBean("applicationContextAwareBean");
        System.out.println(applicationContextAwareBean.isSingleton("singleTon"));

        BeanNameAwareBean bean = (BeanNameAwareBean) context.getBean("beanNameAwareBean");
        System.out.println(bean.getClass().getName());
    }
}
