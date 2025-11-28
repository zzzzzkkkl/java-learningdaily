package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        /*判断101-200之间有多少个素数，
        并输出所有素数
         */

        //遍历101-200之间所有的数
        int count=0;//统计有多少个质数
        for(int i=101;i<=200;i++){
            boolean flag=true;//将每个数都先标记为true，是质数就改成false

            //从2开始到i，看i能整除哪个数
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }

            //flag依旧是true的就是质数，用count计数
            if(flag){
                System.out.println(i+"是质数");
                count++;
            }
        }
        System.out.println("共有"+count+"个质数");
    }
}
