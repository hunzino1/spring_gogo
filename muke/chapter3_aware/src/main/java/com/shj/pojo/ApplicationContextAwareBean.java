package com.shj.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @create 2019/6/27
 */
public class ApplicationContextAwareBean implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        System.out.println("++ aware ++" + applicationContext.hashCode());
    }

    public boolean isSingleton(String classPath) {
        return this.applicationContext.isSingleton(classPath);
    }
}
