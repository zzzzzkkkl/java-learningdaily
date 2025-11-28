package com.itheima.test;

import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        /*生成验证码，可以是小写字母，也可以是大写字母，还可以是数字
        规则：长度为5,内容是4位字母、1位数字，数字只有一位可以出现在任意位置
         */
        String code="";
        //1、生成一个0-9的随机数
        Random r=new Random();
        int number=r.nextInt(10);
        //2、定义一个字符数组，里面存放26个大写和小写字母
        char arr[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q',
                'r','s','t','u','v','w', 'x','y','z',
                'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q',
                'R','S','T','U','V','W', 'X','Y','Z'};
        //3.随机选4个索引
        for (int i = 0; i < 4; i++) {
            int index=r.nextInt(arr.length);
            code=code+arr[index];
        }
        //4、将生成的随机数字和字母连在一起
        code=number+code;
        //5、由于数字可以出现在任意位置，所以将生成的code打乱，即修改字符串（用substring或者用字符数组
        String result=rotate(code);
        System.out.println(result);
    }
    //方法5
    public static String rotate(String str){
        //把字符串变成字符数组
        char arr[]=str.toCharArray();
        //将number和一个随机索引交换位置
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int index=r.nextInt(arr.length);
            char temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        //将字符数组变成字符串
        String newArr=new String(arr);
        return newArr;
    }
}
