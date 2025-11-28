package com.itheima.skiploop;

public class SkiploopDemo1 {
    public static void main(String[] args) {
        //跳过某一次循环
        for(int i=1;i<=5;i++){
            if(i==3){
                continue;//第三个包子有虫，跳过。结束本次循环，继续下次
            }
            System.out.println("小老虎在吃第"+i+"个包子");
        }
    }
}
