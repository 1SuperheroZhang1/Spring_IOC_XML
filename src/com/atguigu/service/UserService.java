package com.atguigu.service;

import com.atguigu.dao.UserDao;

/**
 * IOC管理bean：注入属性-外部bean，对应配置文件bean2.xml
 * @author superherozhang
 * @create 2022-09-28 17:22
 */
public class UserService {
    //创建UserDao类型属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add......");
        userDao.update();
    }
}
