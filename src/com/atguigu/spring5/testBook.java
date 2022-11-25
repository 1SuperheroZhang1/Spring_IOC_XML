package com.atguigu.spring5;

import com.atguigu.connectiontype.Book;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author superherozhang
 * @create 2022-09-28 19:26
 */
public class testBook {
    @Test
    public void testConnection(){
        //1. 加载spring的配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("book.xml");
        //2. 获取配置创建的对象
        Book book1= context.getBean("book", Book.class);
        Book book2= context.getBean("book", Book.class);
        System.out.println(book1);
        System.out.println(book2);
    }
}
