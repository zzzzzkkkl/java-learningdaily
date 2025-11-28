package sort;

public class SelectionDemo1 {
    public static void main(String[] args) {
        /*选择排序：
        从0索引开始，跟最后面的元素一一比较
        小的放前面，大的放后面
        第一次循环结束后，最小的数据已经确定
        第二次循环结束后，第二小的数据也已经确定
         */
        int[] arr={2,4,5,3,1};

        //外层循环：表示轮次
        for (int i = 0; i < arr.length-1; i++) {
            //内层循环：表示排序
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
