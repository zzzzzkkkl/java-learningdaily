package com.itheima.a01extendsdemo5;

public class Maintainer extends AdminStaff{
    public Maintainer() {
    }

    public Maintainer(String name, String id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println("维护专员在维护客户");
    }
}
