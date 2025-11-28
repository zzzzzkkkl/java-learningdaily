package com.itheima.test;

public class ArrTest3 {
    public static void main(String[] args) {
        /*定义一个数组，存储1,2,3,4,5,6,7,8,9,10
        遍历得到每一个元素
        若是奇数，则将当前数字扩大2倍
        若是偶数，则将其变成1/2
         */

        double arr[]={1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                arr[i]=arr[i]/2;
            }else{
                arr[i]=2*arr[i];
            }
          //一个循环只干一件事  System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
