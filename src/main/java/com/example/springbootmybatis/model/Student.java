package com.example.springbootmybatis.model;

public class Student {
    String name;
    String id;
    int age;
    String school;
    String majority;
    String group;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setMajority(String majority) {
        this.majority = majority;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getSchool() {
        return school;
    }

    public String getMajority() {
        return majority;
    }

    public String getGroup() {
        return group;
    }

    public String toString(){
        if(id == null){return null;}
        return "school:"+this.school+", "+"majority:"+this.majority+", "+"group:"+this.group+", "+"name:"+this.name+", "+"age:"+this.age+"id:"+this.id;
    }



}
