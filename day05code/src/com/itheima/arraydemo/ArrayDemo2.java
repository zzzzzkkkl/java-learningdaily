package com.itheima.arraydemo;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //获取数组里的元素
        int arr[]={1,2,3,4,5};
        int number=arr[0];
        System.out.println(number);
        System.out.println(arr[1]);

        //把数据存到数组中
        arr[0]=100;
        System.out.println(arr[0]);
    }
}
