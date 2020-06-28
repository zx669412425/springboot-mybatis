package com.example.springbootmybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.example.springbootmybatis.model.Student;

@Repository
public interface StudentMapper {
    Student select(String id);

    Student selectByCondition(String name);

    int insertStu(@Param("student")Student student);
}
