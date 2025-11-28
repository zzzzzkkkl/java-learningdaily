package com.itheima.test;

public class Test8 {
    public static void main(String[] args) {
        /*定义一个方法，把int数组中的数据按照指定格式拼接成一个字符串返回
        要求：若传递的参数为空，返回null；若传递的数组元素个数为0，返回[];若数组为int arr[]={1,2,3}，
        执行方法后的输出结果为[1,2,3]
         */
        //1、定义一个数组
        int arr[]={1,2,3};
        //2、拼接成字符串返回
        String str=arrayToString(arr);
        System.out.println(str);
    }
    //方法2
    public static String arrayToString(int arr[]){
        if(arr==null){
            return null;
        }
        //利用StringBuilder里的append方法拼接
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        //遍历获得数组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if(i!=arr.length-1){
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
