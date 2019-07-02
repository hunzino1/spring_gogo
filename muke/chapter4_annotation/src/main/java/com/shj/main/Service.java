package com.shj.main;

import com.shj.pojo.AnnotationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Service {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        AnnotationBean annotationBean = (AnnotationBean) context.getBean("annotationBean");
        System.out.println(annotationBean.hashCode());
    }

}
