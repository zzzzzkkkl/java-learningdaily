package com.itheima.arraydemo;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        //获取数组中的元素
        /*System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);*/

        //利用循环改进代码
        /*for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }*/

        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            
        }
    }
}
