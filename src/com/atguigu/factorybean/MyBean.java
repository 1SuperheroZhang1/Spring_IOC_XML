package com.atguigu.factorybean;

import com.atguigu.connectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * 工厂bean：在配置文件中定义的bean类型可以和返回类型不一样，对应配置文件mybean.xml
 * @author superherozhang
 * @create 2022-09-29 8:03
 */
public class MyBean implements FactoryBean<Course> {

    //定义返回的bean类型
    @Override
    public Course getObject() throws Exception {
        Course course=new Course();
        course.setName("数据库");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
