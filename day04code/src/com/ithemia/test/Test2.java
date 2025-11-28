package com.ithemia.test;

public class Test2 {
    public static void main(String[] args) {
        /*无人驾驶汽车遇到红绿灯进行判断
        红灯停
        绿灯行
        黄灯减速
         */

        //定义三个变量表示灯的状态,true亮 false灭
        boolean isLightGreen=false;
        boolean isLightYellow=false;
        boolean isLightRed=true;

        //判断
        if(isLightGreen){
            System.out.println("gogogo!!!");
        }
        if(isLightYellow){
            System.out.println("slow!!!");
        }
        if(isLightRed){
            System.out.println("stop!!!");
        }
    }
}
