package com.atguigu.bean;

/**
 * bean的生命周期，对应配置文件Orders.xml
 * @author superherozhang
 * @create 2022-09-29 16:14
 */
public class Orders {
    private String name;

    //无参数构造
    public Orders() {
        System.out.println("1.执行无参数构造方法创建bean实例");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2.调用set方法设置属性值");
    }

    //创建执行的初始化的方法
    public void initMethod(){
        System.out.println("3.执行初始化的方法");
    }

    //创建执行的销毁的方法
    public void destroyMethod(){
        System.out.println("5.执行销毁的方法");
    }
}
