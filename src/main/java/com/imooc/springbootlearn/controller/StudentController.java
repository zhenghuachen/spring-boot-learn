package com.imooc.springbootlearn.controller;

import com.imooc.springbootlearn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述： 学生Controller
 */
@RestController // 此注解说明这个类是一个Controller，RestController说明接口返回的是一个JSON而非网页
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/student")
    public String requestPara(@RequestParam Integer id){  //传入参数ID
        return studentService.getStudent(id).toString();
    }
}
