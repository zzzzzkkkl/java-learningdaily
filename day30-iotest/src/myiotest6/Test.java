package myiotest6;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        /*
        需求：写一个登陆小案例
        步骤：
        将正确的用户名和密码手动保存到本地的userinfo.txt文件中
        保存格式：username=zhangsan&password=123
        让用户键盘录入账号和密码，比较用户录入的和正确的是否一致
        如果一致则打印成功，不一致打印登陆失败
         */
        //1.读取文件中的正确登录名和密码
        BufferedReader br=new BufferedReader(new FileReader(new File("userinfo.txt")));
        String line=br.readLine();
        br.close();

        String[] userInfo = line.split("&");
        String[] arr1 = userInfo[0].split("=");
        String[] arr2 = userInfo[1].split("=");

        String rightUsername=arr1[1];
        String rightPassword=arr2[1];

        //2.用户键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password=sc.nextLine();

        //3.比较
        if(rightUsername.equals(username)&&rightPassword.equals(password)){
            System.out.println("登陆成功");
        }else{
            System.out.println("登陆失败");
        }
    }
}
