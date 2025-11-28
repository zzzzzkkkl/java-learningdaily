package search;

public class BinarySearchDemo1 {
    public static void main(String[] args) {
        //二分查找 折半查找
        //核心：每次排除掉一半的数据
        /*需求：定义一个方法利用二分查找，查询某个元素在数组中的索引 {131,127,147,81,103,23,7,79,81}
         */

        int[] arr={7,23,79,81,103,127,131,147};
        System.out.println(binarySearch(arr,81));
    }
    public static int binarySearch(int[] arr,int number){
        //1.定义两个变量，min max记录查找的范围
        int min=0;
        int max=arr.length-1;
        //2.利用循环 不断查找
        while(true) {
            if (min > max) {
                return -1;
            }
            //找数据 3.找mid=min+max除以2
            int mid=(min+max)/2;
            //4.拿着mid索引指向的元素跟要查找的元素进行对比
            if(arr[mid]>number){
                //4.1 number在mid左边
                max=mid-1;
            }else if(arr[mid]<number){
                //4.2 number在mid右边
                min=mid+1;
            }else{
                //4.3 number跟mid指向的元素一样
                return mid;
            }
        }
    }
}
