package com.shj.pojo;

/**
 * @create 2019/6/14
 */
public class BeInjectClass {
    private InjectClass injectClass;

    public BeInjectClass() {
    }

    public BeInjectClass(InjectClass injectClass) {
        this.injectClass = injectClass;
    }

    public InjectClass getInjectClass() {
        return this.injectClass;
    }

    public void setInjectClass(InjectClass injectClass) {
        this.injectClass = injectClass;
    }

    @Override
    public String toString() {
        return "BeInjectClass{" +
                "injectClass=" + injectClass +
                '}';
    }
}
