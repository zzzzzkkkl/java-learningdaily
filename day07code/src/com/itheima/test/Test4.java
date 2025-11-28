package com.itheima.test;

public class Test4 {
    public static void main(String[] args) {
        /*把一个数组中的元素复制到另一个新数组中
         */

        int arr1[]={1,2,3,4};
        int arr2[]=new int[arr1.length];
        int index=0;

        for(int i=0;i<arr1.length;i++){
            arr2[index]=arr1[i];
            index++;
        }
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
