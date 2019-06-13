package com.shj.pojo;

/**
 * @create 2019/6/13
 */
public class TestBeanClass {
    private int id;
    private String name;

    public TestBeanClass() {
    }

    public TestBeanClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TestBeanClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
