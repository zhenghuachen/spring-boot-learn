package com.imooc.springbootlearn.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：   和配置相关Controller
 */
@RestController
public class PropertiesController {
    /**
     * @Value 注解用于将属性值注入到Spring中的Bean中,可以用于注入不同类型的值，如字符串、数字、布尔值等。
     * ${school.grade}是一个SpEL(Spring 表达式语言）表达式，它表示从名为school的Bean中获取名为grade的属性值。
     */
    @Value("${school.grade}")
    Integer grade;
    @Value("${school.classnum}")
    Integer classnum;
    // 静态变量注入时@Value的位置有所不同;
    static Integer age;
    @GetMapping("/gradeclass")  //指定URL
    public String gradeClass() {
        return "年级：" + grade + "班级：" + classnum;
    }

    @GetMapping("/static")  //指定URL
    public String staticPara() {
        return "静态变量的值：" + age;
    }

    /**
     * 由于静态变量属于类，而不属于类的实例,而@Value注入的是类的实例,所以不能同上处理
     * PropertiesController类有一个名为age的静态属性，它被注入了一个整数值。setAge()方法用于
     * 将注入的字符串值赋值给age静态属性。
     * @param age
     */
    @Value("${school.age}")
    public void setAge(Integer age) {
        PropertiesController.age = age;
    }
}
