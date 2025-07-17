//导包，用这个包，就要先找到
//要写在类定义上边
import java.util.Scanner;
//这种方式只能接收整数
public class ScannerDemo1{
    public static void main(String[] args){
        //创建对象
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数据：");
        //接收数据,键盘输入什么，sc就被赋为什么
       int i= sc.nextInt();
       System.out.println(i);

    }
}