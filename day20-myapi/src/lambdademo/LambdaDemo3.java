package lambdademo;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo3 {
    public static void main(String[] args) {
        /*定义数组并存储一些字符串，利用Arrays中的sort方法进行排序
        要求：按照字符串的长度进行排序，短的在前，长的在后
         */
        String[] arr={"a","aaaa","aaa","aa"};

        //匿名内部类写法：利用sort方法 指定规则排序
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });

        //Lambda表达式写法 完整格式
        Arrays.sort(arr, (String o1, String o2)-> {
                return o1.length()-o2.length();
        });

        //Lambda表达式写法 简写格式
        Arrays.sort(arr, ( o1,  o2)-> o1.length()-o2.length());

        System.out.println(Arrays.toString(arr));
    }
}
