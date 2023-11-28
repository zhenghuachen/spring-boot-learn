package com.imooc.springbootlearn.controller;

import com.imooc.springbootlearn.pojo.Student;
import org.springframework.web.bind.annotation.*;

/**
 *描述： 演示接口和传参
 */
@RestController  // 此注解说明这个类是一个Controller，RestController说明接口返回的是一个JSON而非网页
public class ParaController {
    // 内容写死，没法对参数进行处理
    @GetMapping("/firstRequest")   //注解指定URL
    public String firstRequest() {
        return "Hello Spring Boot, 我的第一个Spring Boot接口";
    }

    /**
     * 对参数进行接受和处理
     * @RequestParam 用于将请求中的参数绑定到方法的参数上。它通常用于RESTful风格的Web服务中，
     * 用于接收客户端发送的GET或POST请求，并将请求中的参数绑定到方法的参数上。通常用于get
     * @RequestBody 用于将请求体中的数据绑定到方法的参数上。用于接收客户端发送的JSON或XML数据,
     * 并将数据绑定到方法的参数上。通常用于post
     */
    @GetMapping("/para")   //注解指定URL
    public String requestPara(@RequestParam Integer num) {
        num = num + 1;
        return "我收到了参数：" + num;
    }
    @PostMapping("/post")   //注解指定URL
    public String postRepuest(@RequestBody Student student) {
        return "我收到了post参数：" + student;
    }
}
