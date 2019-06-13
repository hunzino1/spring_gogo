package com.shj.pojo;

/**
 * @create 2019/6/14
 */
public class InjectClass {
    private int id;
    private String name;

    public InjectClass() {
    }

    public InjectClass(int id, String name) {
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
        return "InjectClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
