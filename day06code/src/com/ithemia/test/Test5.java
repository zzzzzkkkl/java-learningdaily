package com.ithemia.test;

public class Test5 {
    public static void main(String[] args) {
        /*设计一个方法用于数组遍历，要求遍历的结果是在一行上的
        例如：[11,22,33,44,55]
         */

        //定义数组
        int arr[]={11,22,33,44,55};
        //调用方法
        printArr(arr);
    }
    //定义方法遍历数组
    public static void printArr(int arr[]){
        System.out.print("[");//只打印不换行
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]);//防止最后一个元素后还打印，
            }else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("]");
    }
}
