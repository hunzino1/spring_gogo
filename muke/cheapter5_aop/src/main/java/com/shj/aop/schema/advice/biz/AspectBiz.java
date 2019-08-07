package com.shj.aop.schema.advice.biz;

/**
 * 业务处理类
 */
public class AspectBiz {
    public void biz() {
        System.out.println(getClass().getName() + " biz(),  业务逻辑处理方法");
    }
}
