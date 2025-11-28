package a04test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*需求：
        键盘录入一些1-100之间的证书，并添加到集合当中
        知道集合中所有的数据和超过200
         */

        //1.创建集合 用来添加整数
        ArrayList<Integer> list=new ArrayList<>();
        //2.键盘录入数据 添加到集合中
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("请输入一个整数");
            String numStr = sc.nextLine();
            int num = Integer.parseInt(numStr);

            //先对异常数据进行过滤
            if(num<1||num>100){
                System.out.println("当前数字不在有效范围内，请重新输入");
                continue;
            }
            //将数据添加到集合中
            //细节：
            //num：基本数据类型
            //集合里的数据是Integer
            //再添加数据的时候触发了自动装箱
            list.add(num);//相当于list.add(Integer.valueOf(num))

            //统计集合中所有的数据
            int sum=getSum(list);
            //对sum进行判断
            if(sum>200){
                System.out.println("集合中所有的数据和已经满足要求");
                break;
            }
        }
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            //i:索引
            int num=list.get(i);
            sum=sum+num;
        }
        return 0;
    }
}
