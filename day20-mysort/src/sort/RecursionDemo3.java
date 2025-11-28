package sort;

public class RecursionDemo3 {
    public static void main(String[] args) {
        //需求：利用递归求5的阶乘
        //核心：找出口，找规律
        //心得：方法内部再次调用方法时，参数必须要更加靠近出口
        //eg.第一次调用5 第二次调用4

        //5！=5*4！
        //4!=4*3!
        //...
        //1!=1 出口

        System.out.println(getFactorialRecursion(5));
    }
    public static int getFactorialRecursion(int number){
        if(number==1){
            return 1;
        }
        return number*getFactorialRecursion(number-1);
    }
}
