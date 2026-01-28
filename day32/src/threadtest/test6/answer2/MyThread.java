package threadtest.test6.answer2;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread{
    ArrayList<Integer> list;
    public MyThread(ArrayList<Integer> list){
        this.list=list;
    }

    @Override
    public void run() {
        //局部变量
        //但是测试类里有两个线程对象，每个线程对象抢到锁时都会创建自己的box
        ArrayList<Integer> boxList=new ArrayList<>();//1 //2
        while(true){
            synchronized (MyThread.class){
                if(list.size()==0){
                    System.out.println(getName()+boxList);
                    break;
                }else{
                    Collections.shuffle(list);
                    int prize=list.remove(0);
                    boxList.add(prize);
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
