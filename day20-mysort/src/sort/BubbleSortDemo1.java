package sort;

public class BubbleSortDemo1 {
    public static void main(String[] args) {
        /*冒泡排序：
        核心思想：
        相邻的元素两两比较，大的放右边，小的放左边
        第一轮比较完之后，最大值就已经确定，第二轮可以减少循环一次，后面以此类推
        如果数组中有n个数据，总共我们只要执行n-1轮的代码
         */

        //1.定义数组
        int[] arr={2,4,5,3,1};
        //2.利用冒泡排序 将数组中的数据排序
        //外层循环：轮次
        for (int i = 0; i < arr.length-1; i++) {
            //内层循环：排序
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //遍历数组 验证结果

    }
}
