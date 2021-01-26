package com.dsc.entity;

/**
 * @Classname User
 * @Description TODO
 * @Date 2021/1/26 20:54
 * @Created by 撒破云
 */
public class User {

    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
