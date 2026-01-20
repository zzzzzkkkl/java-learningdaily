package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*
        需求：
        键盘录入自己心仪的朋友姓名和年龄
        姓名长度在3-10位 年龄的范围在18-40
        超过这个范围的就视为异常，无法赋值，需要重新录入，一直录到正确为止
        提示：
        需要考虑用户键盘录入的所有情况
        比如：录入年龄时超出范围，录入年龄时录入了abc
         */
        //1.创建键盘录入的对象
        Scanner sc=new Scanner(System.in);
        //2.创建女朋友对象
        GirlFriend gf=new GirlFriend();
        while (true) {
            //3.接收朋友的姓名
            try {
                System.out.println("请输入朋友名字：");
                String name = sc.nextLine();
                gf.setName(name);
                //4.接受年龄
                System.out.println("请输入朋友年龄：");
                String ageStr=sc.nextLine();//键盘录入什么都接受
                int age = Integer.parseInt(ageStr);
                gf.setAge(age);
                //所有的数据都正确 跳出
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄格式有误，请输入数字");
                continue;
                //Runtime必须写在下面 他是父
            }catch (RuntimeException e) {
                System.out.println("姓名的长度或者年龄的范围有误");
                continue;
            }
        }
        //5.打印朋友信息
        System.out.println(gf);
    }
}
