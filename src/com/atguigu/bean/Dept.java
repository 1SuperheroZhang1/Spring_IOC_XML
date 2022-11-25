package com.atguigu.bean;

/**
 * 部门类
 * @author superherozhang
 * @create 2022-09-28 17:46
 */
public class Dept {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "name='" + name + '\'' +
                '}';
    }
}
