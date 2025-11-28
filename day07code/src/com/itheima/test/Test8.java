package com.itheima.test;

public class Test8 {
    public static void main(String[] args) {
        /*某系统的密码大于0.比如1983，采用加密传输，得到的结果是8346
        规则：每位数加上5，再对10求余，最后将所有数字翻转，得到加密后的结果
        按此规则，解密
         */

        //定义数组记录加密结果
        int arr[]={8,3,4,6};

        //反转
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        //加密时是对10取余
        //因为第一步先加了5，所以第二步取余前的范围是5-14;5-9取余结果不变
        //所以解密时要判断，0-4之间加10,5-9数字不变,无需操作
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=0&&arr[i]<=4){
                arr[i]=arr[i]+10;
            }
        }

        //减五
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]-5;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
