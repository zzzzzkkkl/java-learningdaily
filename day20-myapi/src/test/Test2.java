package test;

public class Test2 {
    public static void main(String[] args) {
        /*不死神兔 有一对兔子，从出生后第三个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子。假如兔子
        都不死，问第十二个月的兔子对数是多少
        1月：1
        2月：1
        3月：2
        4月：3
        5月：5
        6月：8

        特点：从第三个数据开始，是前两个数据的和（斐波那契数列）
         */
        //方法一
       /* //1.创建一个长度为12的数组 每个索引都对应相应的月份的兔子对数
        int[] arr=new int[12];
        //2.手动给0索引和1索引的数据进行赋值
        arr[0]=1;
        arr[1]=1;
        //3.利用循环给剩余的数据进行赋值
        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        //4.获取最大索引的数据
        System.out.println(arr[11]);*/

        //方法二
        //递归的方式去完成
        System.out.println(getSum(12));
    }
    public static int getSum(int month){
        if(month==1||month==2){
            return 1;
        }
        return getSum(month-1)+getSum(month-2);
    }
}
