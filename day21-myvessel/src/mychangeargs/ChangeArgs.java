package mychangeargs;

public class ChangeArgs {
    public static void main(String[] args) {
        //可变参数
        int sum=getSum(6,7,2,12,2121);
        System.out.println(sum);
    }
    public static int getSum(int...arr){
        int sum=0;
        for(int a:arr){
            sum+=a;
        }
        return sum;
    }
}
