package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest6 {
    public static void main(String[] args) {
        /*程序自动生成一个1-100之间的随机数
        使用程序猜出这个数字是多少？

        分析：
        1、生成一个随机数
        2、猜数字
         */

        //导包，创建对象
        Random r=new Random();
        //生成随机数，必须写在循环上面。否则每循环一次就生成一个新的随机数
        int number=r.nextInt(100)+1;
        //键盘录入你要猜的数字
        Scanner sc=new Scanner(System.in);
        //不知道要猜多少次，所以用while循环，猜中直接跳出循环
        while(true){
            System.out.println("请输入你要猜的数字：");
            int guess=sc.nextInt();
            //判断猜的大了还是小了？还是猜中
            if(guess>number){
                System.out.println("猜的数字大了");
            }else if(guess<number){
                System.out.println("猜的数字小了");
            }else{
                System.out.println("猜中了");
                break;
            }
        }

    }
}
