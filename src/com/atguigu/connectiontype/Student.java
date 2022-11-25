package com.atguigu.connectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author superherozhang
 * @create 2022-09-28 18:12
 */
public class Student {
    // 1.数组类型属性
    private String[] courses;

    // 2.list集合类型属性
    private List<String> lists;

    // 3.map集合类型属性
    private Map<String,String> maps;

    // 4.set集合类型属性
    private Set<String> sets;

    //学生所学多门课程
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void test(){
        System.out.println(Arrays.toString(courses));
        System.out.println(lists);
        System.out.println(maps);
        System.out.println(sets);
        System.out.println(courseList);
    }
}
