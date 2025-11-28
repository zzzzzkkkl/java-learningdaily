package com.itheima.test;

public class Test7 {
    public static void main(String[] args) {
        /*把整数中的每一位添加到数组中
         */

        int num=12345;
        int temp=num;//厚棉num改变，还可以用temp
        int count=0;
        while(num!=0){
            num=num/10;
            count++;//得到它是几位数,就知道动态数组多大了
        }
        int arr[]=new int[count];

        //将每一位添加到数组
        int index=0;
        while(temp!=0){
            //获取每一位
            int ge=temp%10;
            temp=temp/10;

            //添加到数组
            arr[count-index-1]=ge;
            index++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
