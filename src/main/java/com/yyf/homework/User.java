package com.yyf.homework;

public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String nike;

    public User(Integer id, String name, Integer age, String nike) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.nike = nike;
    }

    public User(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNike() {
        return nike;
    }

    public void setNike(String nike) {
        this.nike = nike;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", nike='" + nike + '\'' +
                '}';
    }
}
