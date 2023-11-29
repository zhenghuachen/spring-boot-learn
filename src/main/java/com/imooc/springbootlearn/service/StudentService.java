package com.imooc.springbootlearn.service;

import com.imooc.springbootlearn.mapper.StudentMapper;
import com.imooc.springbootlearn.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 描述： 查询学生信息Service
 * @Service 用于标记一个类为服务类。当Spring容器创建一个类时，如果该类被标记为@Service，
 * 那么Spring容器会自动将其注入到其他组件中，以提供服务。
 */
@Service
public class StudentService {
    @Autowired //按类自动注入
    StudentMapper studentMapper;
    // 利用Mapper进行数据库查找
    public Student getStudent(Integer id) {
        return studentMapper.findById(id);
    }
}
