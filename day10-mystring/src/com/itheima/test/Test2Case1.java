package com.itheima.test;

public class Test2Case1 {
    public static void main(String[] args) {
        /*给定两个字符串A和B，A的旋转操作就是将A最左边的字符移到最右边
        例如：A=“abcde”，在移动一次后结果就是“bcdea”
        若干次调整过后A能变成B，返回true，否则返回false*/

        //1、定义两个字符串
        String strA="abcde";
        String strB="cdeab";
        //2、旋转字符串
        strA=rotate(strA);
        //3、循环依次旋转比较
        boolean result=check(strA,strB);
        //4、输出
        System.out.println(result);
    }
    //方法3
    public static boolean check(String strA,String strB){
        for (int i = 0; i < strA.length(); i++) {
            strA=rotate(strA);
            if(strA.equals(strB)){
                return true;
            }
        }
        return false;
    }
    //方法2
    public static String rotate(String str){
        //subString截取思路
        //获取字符串最左侧的字符
        char first=str.charAt(0);
        //获取剩余的字符
        String end=str.substring(1);
        return end+first;
    }
}
