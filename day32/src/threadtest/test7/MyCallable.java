package threadtest.test7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    /*
        多线程之间的比较
        需求：在上一题基础上继续完成如下需求
        在此次抽奖过程中，抽奖箱1总共产生了6个奖项，分别为：10,20,100,500,2,300
        最高奖项为300元，总计额为932元；

        在此次抽奖过程中，抽奖箱2总共产生了6个奖项，分别为：5,50,200,800,80,700
        最高奖项为800元，总计额为1835元；

        在此次抽奖过程中,抽奖箱2中产生了最大奖项,该奖项金额为800元
     */
    ArrayList<Integer> list;
    public MyCallable(ArrayList<Integer> list){
        this.list=list;
    }

    @Override
    public Integer call() throws Exception {
        ArrayList<Integer> boxList=new ArrayList<>();
        while(true){
            synchronized (MyCallable.class){
                if(list.size()==0){
                    System.out.println(Thread.currentThread().getName()+boxList);
                    break;
                }else{
                    Collections.shuffle(list);
                    int prize=list.remove(0);
                    boxList.add(prize);
                }
            }
            Thread.sleep(10);
        }
        if(boxList.size()==0){
            return null;
        }else{
            return Collections.max(boxList);
        }
    }
}
