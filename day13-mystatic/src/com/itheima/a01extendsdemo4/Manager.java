package com.itheima.a01extendsdemo4;

public class Manager extends Employee{
    private double bonus;

    public Manager() {
    }
    //带全部参数的构造=父类+子类
    public Manager(String id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }
    //父类里面有的，get和set就不用写了
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public void work(){
        System.out.println("管理其他人");
    }
}
