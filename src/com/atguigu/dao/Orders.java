package com.atguigu.dao;

/**
 * 使用有参数构造注入属性
 * @author superherozhang
 * @create 2022-09-27 18:02
 */
public class Orders {
    //属性
    private String name;
    private String address;

    //有参构造方法

    public Orders(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void ordersTest(){
        System.out.println(name+"-"+address);
    }
}
