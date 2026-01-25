package myiotest7;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        /*
        需求：写一个登陆小案例（添加锁定账号功能）
        步骤：
        	将正确的用户名和密码手动保存在本地的userinfo.txt文件中。
        	保存格式为:username=zhangsan&password=123&count=0
        	让用户键盘录入用户名和密码
        	比较用户录入的和正确的用户名密码是否一致
        	如果一致则打印登陆成功
        	如果不一致则打印登陆失败，连续输错三次被锁定
         */
        //1.读取文件中的内容 保存正确的登录名和密码
        BufferedReader br=new BufferedReader(new FileReader(new File("D:\\code\\IDEA_Code\\day30-iotest\\src\\myiotest7\\userinfo.txt")));
        String line=br.readLine();

        String[] arr=line.split("&");
        //名字
        String[] arr1=arr[0].split("=");
        String rightUsername=arr1[1];
        //密码
        String[] arr2=arr[1].split("=");
        String rightPassword=arr2[1];
        //次数
        String[] arr3=arr[2].split("=");
        String countStr=arr3[1];
        int count=Integer.parseInt(countStr);

        //关闭
        br.close();

        //2.用户键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入登录名：");
        String username=sc.nextLine();
        System.out.println("请输入密码：");
        String password=sc.nextLine();

        //3.判断
        if(username.equals(rightUsername)&&password.equals(rightUsername)){
            System.out.println("登陆成功");
        }else{
            //输错次数加1
            count++;
            System.out.println("登陆失败"+",还有"+(3-count)+"次机会");
        }

        //4.将更新后的数据再写回文件
        BufferedWriter bw=new BufferedWriter(new FileWriter(new File("D:\\code\\IDEA_Code\\day30-iotest\\src\\myiotest7\\userinfo.txt")));
        bw.write(count+"");
        bw.close();
    }
}
