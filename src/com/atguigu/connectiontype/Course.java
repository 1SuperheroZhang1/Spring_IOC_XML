package com.atguigu.connectiontype;

/**
 * 课程类
 * @author superherozhang
 * @create 2022-09-28 21:47
 */
public class Course {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}
