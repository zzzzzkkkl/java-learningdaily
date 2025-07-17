//导包
import java.util.Scanner;
public class ScannerTest{
    public static void main(String[] args){
        //创建对象
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数据");

        //接受键盘输入的数据
        int i=sc.nextInt();
        System.out.println("请输入第二个数据");
        int j=sc.nextInt();//可以同时接受多个键盘输入的数据
        int s=i+j;

        System.out.println("二者相加的结果是：");
        System.out.println(s);

    }
}