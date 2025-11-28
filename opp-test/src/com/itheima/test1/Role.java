package com.itheima.test1;

import java.util.Random;

public class Role {
    //成员变量，属性
    private String name;
    private int blood;
    //成员方法，行为
    //谁攻击谁？ r1攻击r2，r1调用攻击这个方法；即方法的调用者攻击参数
    public void attack(Role role){
        //计算造成的伤害1-20
        Random r=new Random();
        int hurt=r.nextInt(20)+1;
        //挨揍的人剩下的血
        int remainBlood=role.getBlood()-hurt;
        remainBlood=remainBlood<0?0:remainBlood;//血为负数不合理，赋成0
        role.setBlood(remainBlood);//将挨揍人的血修改成新的值

        //this表示方法的调用者
        System.out.println(this.getName()+"举起拳头，打了"+role.getName()+
                "一下，造成"+hurt+"点伤害，"+role.getName()+"还剩下"+remainBlood+"点血");
    }

    //空参构造
    public Role() {
    }
    //带参构造
    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

   //set/get
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBlood() {
        return blood;
    }
    public void setBlood(int blood) {
        this.blood = blood;
    }

}
