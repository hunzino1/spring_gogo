package com.shj.aop.schema.advice;

public class MoocAspect {
    public void before() {
        System.out.println(this.getClass().getName() + "切面前置通知： before");
    }
}
