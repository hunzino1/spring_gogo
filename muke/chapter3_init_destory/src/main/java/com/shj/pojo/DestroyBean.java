package com.shj.pojo;

import org.springframework.beans.factory.DisposableBean;

/**
 * @create 2019/6/27
 */
public class DestroyBean implements DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy method using implements DisposableBean");
    }
}
