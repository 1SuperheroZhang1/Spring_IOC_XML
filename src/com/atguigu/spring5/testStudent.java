package com.atguigu.spring5;

import com.atguigu.connectiontype.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author superherozhang
 * @create 2022-09-28 19:26
 */
public class testStudent {
    @Test
    public void testConnection(){
        //1. 加载spring的配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("student.xml");
        //2. 获取配置创建的对象
        Student student = context.getBean("student", Student.class);
        student.test();
    }
}
