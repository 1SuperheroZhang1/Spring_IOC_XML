package com.atguigu.spring5;

import com.atguigu.bean.Emp;
import com.atguigu.bean.Orders;
import com.atguigu.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author superherozhang
 * @create 2022-09-28 17:38
 */
public class testBean {
    @Test
    public void testBean1(){
        //1.加载spring配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");

        //2.获取配置创建的对象
        UserService userService = context.getBean("service", UserService.class);
        userService.add();
    }

    @Test
    public void testBean2(){
        //1.加载spring配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean3.xml");

        //2.获取配置创建的对象
        com.atguigu.bean.Emp emp = context.getBean("emp", com.atguigu.bean.Emp.class);
        emp.add();
    }

    @Test
    public void testBean3(){
        //1.加载spring配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean4.xml");

        //2.获取配置创建的对象
        com.atguigu.bean.Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }

    @Test
    public void testBean4(){
        //1.加载spring配置文件
//        ApplicationContext context=new ClassPathXmlApplicationContext("Orders.xml");
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Orders.xml");
        //2.获取配置创建的对象
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("4.获取创建的bean实例对象");
        System.out.println(orders);
        //手动让bean实例销毁
        context.close();
    }


}
