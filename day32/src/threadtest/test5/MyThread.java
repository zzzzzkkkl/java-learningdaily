package threadtest.test5;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread{
    /*
    需求：有一个抽奖池,该抽奖池中存放了奖励的金额,该抽奖池中的奖项为
    {10,5,20,50,100,200,500,800,2,80,300,700};
    创建两个抽奖箱(线程)设置线程名称分别为“抽奖箱1”，“抽奖箱2”

    随机从抽奖池中获取奖项元素并打印在控制台上,
    格式如下:
    抽奖箱1 又产生了一个 10 元大奖
     */

    ArrayList<Integer> list;
    public MyThread(ArrayList<Integer> list){
        this.list=list;
    }

    @Override
    public void run() {
        while(true){
            synchronized (MyThread.class){
                if(list.size()==0){
                    break;
                }else{
                    Collections.shuffle(list);
                    int prize=list.remove(0);
                    System.out.println(getName()+"又产生了一个"+prize+"元大奖");
                }
            }
            //线程休眠 这时别的线程可以抢占
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
