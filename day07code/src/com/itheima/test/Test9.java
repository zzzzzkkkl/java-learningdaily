package com.itheima.test;

import java.util.Random;

public class Test9 {
    public static void main(String[] args) {
        /*直播抽现金红包，分别有{2,588,888,1000,10000}5个奖金
        代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复
        打印效果如下：（不一定非得是下面的顺序）
        888元的现金被抽出
        588元的现金被抽出
        10000元的现金被抽出
        1000元的现金被抽出
        2元的现金被抽出
         */

        int arr[]={2,588,888,1000,10000};
        //定义新数组，来存已经抽过的
        int newArr[]=new int[arr.length];

        //抽奖
        Random r=new Random();
        for (int i = 1; i <=5; i++) {
            int randomIndex=r.nextInt(arr.length);//获得随机索引
            int prize=arr[randomIndex];//获得索引对应的奖项

            //判断奖项是否抽过
            boolean flag=contains(newArr,prize);
            if(!flag){
                newArr[i]=arr[randomIndex];//不在，这个奖能抽；就把他放到新数组
                i++;//添加完后后移索引
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
    //判断奖金是不是在已抽过的数组中
    public static boolean contains(int arr[],int prize){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==prize){
                return true;
            }
        }
        return false;
    }
}
