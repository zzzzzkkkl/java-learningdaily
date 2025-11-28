package search;

import java.util.ArrayList;

public class BasicSearchDemo2 {
    public static void main(String[] args) {
        /*练习：定义一个方法利用基本查找，查询某个元素在数组中的索引
        需要考虑数组中元素是否重复 {131,127,147,81,103,23,7,79，81};
         */
        int[] arr={131,127,147,81,103,23,7,79,81};
        int number=81;
        System.out.println(basicSearch(arr,number));
    }
    //返回多个数据，就把数据放到数组或者集合中，最后再把数组或集合返回
    public static ArrayList<Integer> basicSearch(int[] arr, int number){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==number){
                list.add(i);
            }
        }
        return list;
    }
}
