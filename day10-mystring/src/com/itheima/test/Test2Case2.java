package com.itheima.test;

public class Test2Case2 {
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
        //先把字符串变成一个字符数组，然后再调整字符数组里的数据，最后把字符数组变成字符串
        //把字符串变成字符数组
        char arr[]=str.toCharArray();
       //拿到数组中0索引位置的元素
        char first=arr[0];
        //把剩余的字符依次向前挪一个位置
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        //把0索引位置的元素放到最后
        arr[arr.length-1]=first;
        //把字符数组变成字符串
        String result=new String(arr);
        return result;
    }
}
