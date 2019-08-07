package com.shj.aop.schema.advice;

/**
 * 切面方法类
 */
public class MoocAspect {
    public void before() {
        System.out.println(this.getClass().getName() + "切面前置通知： before");
    }
}
