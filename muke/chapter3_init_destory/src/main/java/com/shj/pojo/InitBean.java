package com.shj.pojo;

import org.springframework.beans.factory.InitializingBean;

/**
 * @create 2019/6/27
 */
public class InitBean implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init method using interface overwriting");
    }
}
