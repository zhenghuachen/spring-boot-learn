package com.imooc.springbootlearn.mapper;

import com.imooc.springbootlearn.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 *
 */
@Mapper
@Repository
public interface StudentMapper {
    // 数据库中根据ID查询学生信息
    @Select("SELECT * FROM students WHERE id=#{id}")
    Student findById(long id);
}
