package com.itheima.a01extendsdemo5;

public class AdminStaff extends Employee{
    public AdminStaff() {
    }

    public AdminStaff(String name, String id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println("行政人员在工作");
    }
}
