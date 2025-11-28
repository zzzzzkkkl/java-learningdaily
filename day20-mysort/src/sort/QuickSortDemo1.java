package sort;

public class QuickSortDemo1 {
    public static void main(String[] args) {
        /*快速排序：
        第一轮：
        以0索引的数字为基准元素，确定基准在数组中的正确位置
        比基准数小的全部在左边，比基准数大的全部在右边
        后面以此类推
         */
        int[] arr={6,1,2,7,9,3,4,5,10,8};

        quickSort(arr,0,arr.length-1);
    }
    /*参数一：要排序的数组
    参数二：要排序数组的起始索引
    参数三：要排序数组的结束索引
     */
    public static void quickSort(int[] arr,int i,int j){
        //定义两个变量，记录要查找的范围
        int start=i;
        int end=j;

        if(start>end){
            //递归出口
            return;
        }

        //记录基准数
        int baseNumber=arr[i];//数组中的第一个数

        //利用循环 找到要交换的两个数字
        while(start!=end){
            //利用end从后往前找比基准小的数字
            while(true){
                if(end<=start||arr[end]<baseNumber){
                    break;
                }
                //end前移
                end--;
            }
            //利用start从前往后找比基准大的数字
            while(true){
                if(end<=start||arr[start]>baseNumber){
                    break;
                }
                //start后移
                start++;
            }
            //把end和start指向的元素进行交换
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }

        //当start和end指向同一元素时，上面的while终止
        //表示找到基准数在数组中应该存入的位置
        //基准数归位，将基准和start，end指向的元素交换位置
        int temp=arr[i];
        arr[i]=arr[start];
        arr[start]=temp;

        //确定基准左边的元素，重复这个方法
        quickSort(arr,i,start-1);
        //确定基准右边的元素，重复这个方法
        quickSort(arr,start+1,j);
    }
}
