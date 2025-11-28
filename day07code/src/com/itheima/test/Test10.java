package com.itheima.test;

import javax.lang.model.util.ElementScanner8;
import java.util.Random;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        /*双色球中奖系统
        6个红球号码，1个蓝球号码。红球号码从1-33中选，不重复，蓝球号码从1-16中选
         */

        //1、系统生成中奖号码
        int arr[]=creatNumber();
        System.out.println("====================");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
        System.out.println("====================");

        //2、用户输入自己买的号码
        int userInputArr[]=userInputNumber();

        //3、对照中奖号码，判断是否中奖(注意，自己的号码只要在中奖号码中存在就算中）
        //红篮球的中奖个数
        int redCount=0;
        int blueCount=0;
        //3.1判断红球中了几个
        for (int i = 0; i < userInputArr.length-1; i++) {//注意这里userInputArr.length-1，因为有一个是篮球
           int redNumber=userInputArr[i];
            for (int j = 0; j < arr.length-1; j++) {
                if(redNumber==arr[j]){
                    redCount++;
                    break;//找到一个，就跳出内循环，继续判断下一个红球号码i是否中
                }
            }
        }
        //3.2判断蓝球中了几个
        int blueNumber=userInputArr[userInputArr.length-1];
        if(blueNumber==arr[arr.length-1]){
            blueCount++;
        }
        //3.3根据红蓝球的中奖个数，判断中了几等奖
        if(redCount==6&&blueCount==1){
            System.out.println("恭喜你中奖一千万");
        }else if(redCount==6&&blueCount==0){
            System.out.println("恭喜你中奖五百万");
        }
        else if(redCount==5&&blueCount==1){
            System.out.println("恭喜你中奖3000元");
        }else if((redCount==4&&blueCount==1)||(redCount==5&&blueCount==0)){
            System.out.println("恭喜你中奖200元");
        }
        else if((redCount==3&&blueCount==1)||(redCount==4&&blueCount==0)){
            System.out.println("恭喜你中奖10元");
        }
        else if((redCount==2&&blueCount==1)||(redCount==0&&blueCount==0)||(redCount==1&&blueCount==1)){
            System.out.println("恭喜你中奖5元");
        }else{
            System.out.println("谢谢参与");
        }
    }

    //方法1-生成中奖号码
    public static int[] creatNumber(){
        //1)定义数组，来存中奖号码
        int arr[]=new int[7];

        //2)生成随机号码，添加到数组中
        Random r=new Random();
        //2.1)生成6个随机且不同的红球号码
        for (int i = 0; i < 6; ) {
            int redNumber=r.nextInt(33)+1;
            boolean flag=contains(arr,redNumber);
            //不存在，就把红球号码添加到数组中
            if(!flag){
                arr[i]=redNumber;
                i++;
            }
        }
        //2.2)生成蓝球号码
        int blueNumber=r.nextInt(16)+1;
        arr[arr.length-1]=blueNumber;

        //3)返回生成的中奖号码数组
        return arr;
    }

    //方法2-用户输入自己买的号码
    public static int[] userInputNumber(){
        //1)定义数组，来添加用户买的号码
        int arr[]=new int[7];

        //2)键盘录入自己的号码
        Scanner sc=new Scanner(System.in);
        //2.1)输入红球号码
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第"+(i+1)+"个红球号码:");
            int redNumber=sc.nextInt();
            if(redNumber>=1&&redNumber<=33){
                boolean flag=contains(arr,redNumber);
                //号码在范围内，且不重复，才能添加到数组
                if(!flag) {
                    arr[i] = redNumber;
                    i++;
                }else{
                    System.out.println("当前红球号码已存在，请重新输入");
                }
            }else{
                System.out.println("当前红球号码超出范围");
            }
        }
        //2.2)输入蓝球号码
        System.out.println("请输入蓝球号码：");
        while(true) {
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <= 19) {
                arr[arr.length - 1] = blueNumber;
                break;
            } else {
                System.out.println("当前蓝球号码超出范围，请重新输入");
            }
        }

        //3)返回用户买的号码数组
        return arr;
    }

    //判断生成的随机数是否在数组中存在，看是否有重复号码
    public static boolean contains(int arr[],int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }
}
