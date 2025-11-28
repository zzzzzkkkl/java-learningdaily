package com.itheima.interclassdemo2;

public class Outer {
    private class Inner{

    }
    public Inner getInstance(){
        return new Inner();
    }
}
