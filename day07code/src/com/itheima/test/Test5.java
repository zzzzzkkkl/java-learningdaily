package com.itheima.test;

import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        /*歌唱比赛中，6位评委给选手打分，分数范围是0-100间的整数
        选手最终得分：去掉最高分和最低分，剩下四个评委的平均分
        请计算最终得分
         */

        //获得6个随机分数
        Random r=new Random();
        int score[]=new int[6];
        for(int i=0;i<score.length;i++){
            score[i]=r.nextInt(101);
        }
        for (int i=0;i<score.length;i++){
            System.out.println(score[i]);
        }

        //遍历6个分数求和
        int sum=0;
        for(int i=0;i<score.length;i++){
            sum+=score[i];
        }
        int max=getMax(score);
        int min=getMin(score);
        sum=sum-max-min;
        double average=sum/4.0;
        System.out.println(average);
    }
    public static int getMax(int arr[]){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int getMin(int arr[]){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
