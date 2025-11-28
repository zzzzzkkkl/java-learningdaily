package com.itheima.test;

public class Test6 {
    public static void main(String[] args) {
        /*某系统的密码大于0.比如1983，采用加密传输
        规则：每位数加上5，再对10求余，最后将所有数字翻转，得到加密后的结果
         */

        //将原始密码放进数组中
        int arr[]={1,9,8,3};

        //将数字加密
        //+5
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+5;
        }
        //%10
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]%10;
            //System.out.println(arr[i]);
        }
        //反转，利用指针
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        /*反转，回文数
        int a=6438;
        int sum=0;
        while(a!=0){
            int b=a%10;
            a=a/10;

            sum=sum*10+b;
        }*/

        //将数组里的数字拼接
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            num=num*10+arr[i];
        }
        System.out.println(num);
    }
}
