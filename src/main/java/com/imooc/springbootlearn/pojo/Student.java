package com.imooc.springbootlearn.pojo;

/**
 * 描述： 学生实体类
 */
public class Student {
    Integer id;
    String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
