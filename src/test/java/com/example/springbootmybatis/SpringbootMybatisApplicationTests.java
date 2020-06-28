package com.example.springbootmybatis;

import com.example.springbootmybatis.model.Student;
import com.example.springbootmybatis.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisApplicationTests {
    @Autowired
    StudentService studentService;
    @Test
    public void test(){
        System.out.println("----");
        System.out.println(studentService.sel("00001").toString());
    }

    @Test
    public void selByConTest(){
        System.out.println(studentService.selByCon("jerry").toString());
    }

    @Test
    public void insert(){
        Student student1 = new Student();
        student1.setId("00005");
        student1.setName("zzzz");
        student1.setAge(25);
        student1.setMajority("computer");
        student1.setSchool("ecust");
        student1.setGroup("5");
        System.out.println(studentService.insertStu(student1));
    }

    @Test
    void contextLoads() {
    }

}
