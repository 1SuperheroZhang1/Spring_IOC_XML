package com.atguigu.dao;

/**
 * 使用set方法进行属性注入，对应配置文件bean1.xml
 * @author superherozhang
 * @create 2022-09-27 17:50
 */
public class Book {
    //创建属性
    private String name;
    private String author;
    private String address;

    //创建属性对应的set方法

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void testDemo(){
        System.out.println(name+"::"+author+"::"+address);
    }
}
