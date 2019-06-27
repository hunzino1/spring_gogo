package com.shj.main;

import com.shj.pojo.ScopeBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @create 2019/6/27
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 单例
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        ScopeBean bean1 = (ScopeBean) context.getBean("scopeBean");
        ScopeBean bean2 = (ScopeBean) context.getBean("scopeBean");
        bean1.sayHashCode();
        bean2.sayHashCode();
        /**
         * 单例只在同一个容器中有效
         */
        ApplicationContext context1 = new ClassPathXmlApplicationContext("spring-context.xml");
        ScopeBean bean3 = (ScopeBean) context1.getBean("scopeBean");
        bean3.sayHashCode();
        /**
         * 非单例
         */
        ScopeBean bean4 = (ScopeBean) context.getBean("scope");
        ScopeBean bean5 = (ScopeBean) context.getBean("scope");
        bean4.sayHashCode();
        bean5.sayHashCode();

    }

}
