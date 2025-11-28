package com.itheima.test;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        //把一位数组中的数据打乱顺序，按照四个一组的方式添加到二维数组中
        //1.定义一个一维数组
        int[] tempArr={10,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        //2.打乱数组中的数据 方法一：遍历数组，拿着每个元素和一个随机索引对应的元素交换
        Random r=new Random();
        for (int i = 0; i < tempArr.length; i++) {
            //获取随机索引
            int index=r.nextInt(tempArr.length);
            //遍历得到的每个元素和随机索引对应的元素交换
            int temp=tempArr[i];
            tempArr[i]=tempArr[index];
            tempArr[index]=temp;
        }
        //3.遍历数组
        for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i]+" ");
        }
        System.out.println();
        //4.创建一个二维数组
        int[][] data=new int[4][4];
        //5.给二维数组添加数据
        //方法二：遍历二维数组，给每个数据赋值
        int index=0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                data[i][j]=tempArr[index];
                index++;
            }
        }
        //遍历输出二维数组
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
    }
}
