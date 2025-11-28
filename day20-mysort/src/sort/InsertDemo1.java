package sort;

public class InsertDemo1 {
    public static void main(String[] args) {
        /*插入排序*/
        int[] arr={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};

        //1.找到无序的那一组数据是从哪个索引开始的
        int startIndex=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[i+1]){//当前元素比后面的元素大，那么i+1就是无序序列的开始索引
                startIndex=i+1;
                break;
            }
        }
        //2.遍历无序序列
        for (int i = startIndex; i < arr.length; i++) {
            //记录当前要插入数据的索引
            int j=i;//下面要不断修改这个索引，所以需要记录

            while(j>0&&arr[j]<arr[j-1]){
                //待插入元素比前面的小，交换位置
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;

                //交换完之后，j前移，继续和它前一个数比较
                j--;
            }
        }
        printArr(arr);
    }
    //遍历数组
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
