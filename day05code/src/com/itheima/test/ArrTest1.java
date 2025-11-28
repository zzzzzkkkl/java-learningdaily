package com.itheima.test;

public class ArrTest1 {
    public static void main(String[] args) {
    /*定义一个数组，存储1,2,3,4,5
    便利的到每一个元素，求数组里所有数的和
     */

        //定义数组
        int arr[] = {1, 2, 3, 4, 5};
        //遍历求和
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
