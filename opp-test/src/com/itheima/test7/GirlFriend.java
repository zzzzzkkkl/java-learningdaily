package com.itheima.test7;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;
    private String hooby;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age, String gender, String hooby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hooby = hooby;
    }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHooby() {
        return hooby;
    }

    public void setHooby(String hooby) {
        this.hooby = hooby;
    }
}
