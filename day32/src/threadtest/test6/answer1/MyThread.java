package threadtest.test6.answer1;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread{
    /*
        需求：在上一题基础上继续完成如下需求
        每次抽的过程中，不打印，抽完时一次性打印(随机

        在此次抽奖过程中，抽奖箱1总共产生了6个奖项：分别为：10,20,100,500,2,300
        最高奖项为300元，总计额为932
         */

    ArrayList<Integer> list;
    public MyThread(ArrayList<Integer> list){
        this.list=list;
    }

    //线程一
    static ArrayList<Integer> list1=new ArrayList<>();
    //线程二
    static ArrayList<Integer> list2=new ArrayList<>();

    @Override
    public void run() {
        while(true){
            synchronized (MyThread.class){
                if(list.size()==0){
                    //证明抽奖箱里的所有钱都已经抽完了
                    //打印两个抽奖箱 看里面抽到了谁
                    if("抽奖箱1".equals(getName())){
                        System.out.println("抽奖箱1" + list1);
                    }else {
                        System.out.println("抽奖箱2" + list2);
                    }
                    break;
                }else{
                    //没抽完
                    Collections.shuffle(list);
                    int prize=list.remove(0);
                    if("抽奖箱1".equals(getName())){
                        list1.add(prize);
                    }else{
                        list2.add(prize);
                    }
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
