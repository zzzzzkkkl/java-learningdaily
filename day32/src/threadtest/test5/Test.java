package threadtest.test5;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
         /*
    需求：有一个抽奖池,该抽奖池中存放了奖励的金额,该抽奖池中的奖项为
    {10,5,20,50,100,200,500,800,2,80,300,700};
    创建两个抽奖箱(线程)设置线程名称分别为“抽奖箱1”，“抽奖箱2”

    随机从抽奖池中获取奖项元素并打印在控制台上,
    格式如下:
    抽奖箱1 又产生了一个 10 元大奖
     */

        //创建奖池
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);

        //创建线程
        MyThread t1=new MyThread(list);
        MyThread t2=new MyThread(list);

        //为线程设置名字
        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");

        t1.start();
        t2.start();
    }
}
