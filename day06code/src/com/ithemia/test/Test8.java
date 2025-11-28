package com.ithemia.test;

public class Test8 {
    public static void main(String[] args) {
        /*定义一个方法copyOfRange（int arr[],int from,int to)
        将数组arr中从索引from（包括from）开始，
        到索引to结束（不包含to）的元素复制到新数组中
        将新数组返回
         */

        //定义原始数组
        int arr[]={1,2,3,4,5,6,7,8,9};
        //调用方法拷贝数组
        int copy[]=copyOfRange(arr,3,7);
        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }

    }
    public static int[] copyOfRange(int arr[],int from,int to){
        //定义拷贝后的数组
        int newArr[]=new int[to-from];
        //伪造索引
        int index=0;
        for (int i = from; i < to; i++) {
            newArr[index]=arr[i];
            index++;
        }
        return newArr;
    }
}
