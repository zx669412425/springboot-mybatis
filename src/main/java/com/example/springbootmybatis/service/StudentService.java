package com.example.springbootmybatis.service;

import com.example.springbootmybatis.mapper.StudentMapper;
import com.example.springbootmybatis.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class StudentService {

    @Autowired
    StudentMapper studentMapper;

    public Student sel(String id){
           return studentMapper.select(id);
    }

    public Student selByCon(String name){
         Student student = studentMapper.selectByCondition(name);
         if(student == null){
             return new Student();
         }
         return student;
    }

    @Transactional(rollbackFor = Exception.class)
    public int insertStu(Student student){
        int i = studentMapper.insertStu(student);
        //测试数据是否插入成功，回滚后可在数据库表中查看并无此条数据。
        System.out.println("数据插入成功，根据id查询");
        System.out.println(sel(student.getId()).toString());
        a();

        return i;
    }
// 方法中抛出异常，用来测试是否回滚
    public void a(){
        System.out.println("准备抛异常了！");
        throw new NegativeArraySizeException();
    }

}
