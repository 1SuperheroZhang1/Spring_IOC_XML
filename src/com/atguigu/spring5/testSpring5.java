package com.atguigu.spring5;

//import com.atguigu.bean.Emp;
import com.atguigu.autowire.Emp;
import com.atguigu.dao.Book;
import com.atguigu.dao.Orders;
import com.atguigu.dao.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author superherozhang
 * @create 2022-09-27 17:07
 */
public class testSpring5 {
    @Test
    public void testAdd(){
        //1. 加载spring配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        //2. 获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook(){
        //1. 加载spring配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        //2. 获取配置创建的对象
        Book book = context.getBean("book", Book.class);

        System.out.println(book);
        book.testDemo();
    }

    @Test
    public void testOrders(){
        //1. 加载spring配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        //2. 获取配置创建的对象
        Orders orders = context.getBean("orders", Orders.class);

        System.out.println(orders);
        orders.ordersTest();
    }

    @Test
    public void testAutoWire(){
        //1.加载spring配置文件
//        ApplicationContext context=new ClassPathXmlApplicationContext("Orders.xml");
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("autowire.xml");
        //2.获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);
        emp.test();
        System.out.println(emp);

    }
}
