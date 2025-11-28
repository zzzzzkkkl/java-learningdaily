package com.itheima.a08regexdemo;

public class RegexDemo8 {
    public static void main(String[] args) {
        /*replaceAll 按正则表达式的规则进行替换,得到的结果是一个字符串
        方法在底层跟之前一样也会创建文本解析器的对象
        然后从头开始去读取字符串里的内容，只要有满足的，那么就用第二个参数去替换

        split 按正则表达式的规则切割，得到的结果是数组！
         */
        /*有一串字符:小诗诗dqwgqwfqwfwq12312小丹丹dqwefqwfwq12312小惠惠
        要求1：把字符串中三个姓名之间的字母替换为vs
        要求2：把字符串中的三个姓名切割出来
         */
        String s="小诗诗dqwgqwfqwfwq12312小丹丹dqwefqwfwq12312小惠惠";
        String result1=s.replaceAll("[\\w&&[^_]]+","vs");
        System.out.println(result1);

        System.out.println("--------------------------------------------");
        String[] arr=s.split("[\\w&&[^_]]+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
