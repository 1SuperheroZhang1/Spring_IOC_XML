package com.atguigu.connectiontype;

import java.util.List;

/**
 * @author superherozhang
 * @create 2022-09-29 0:02
 */
public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void test(){
        System.out.println(list);
    }
}
