package com.ithemia.test;

public class Test13 {
    public static void main(String[] args) {
        /*玩游戏时，网不好要断线重连
        公司要求，断线重连的次数最多写5次
        备注：断线重连的业务逻辑用输出语句替代
         */

        //循环开始1，结束5
        for(int i=1;i<=5;i++){
            System.out.println("第"+i+"次执行断线重连");
        }
    }
}
