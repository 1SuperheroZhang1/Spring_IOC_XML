package com.atguigu.autowire;

/**
 * 员工类，演示自动装配 对应配置文件autowire.xml
 * @author superherozhang
 * @create 2022-09-29 16:58
 */
public class Emp {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void test(){
        System.out.println(dept);
    }
}
