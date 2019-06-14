package com.shj.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @create 2019/6/14
 */
@Component("beInjectClass")
public class BeInjectClass {

    @Autowired
    private InjectClass injectClass;
    private int id;

    public BeInjectClass() {
    }

    public InjectClass getInjectClass() {
        return this.injectClass;
    }

    public void setInjectClass(InjectClass injectClass) {
        this.injectClass = injectClass;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BeInjectClass{" +
                "injectClass=" + injectClass +
                ", id=" + id +
                '}';
    }
}
