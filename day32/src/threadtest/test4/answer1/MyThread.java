package threadtest.test4.answer1;

import java.util.Random;

public class MyThread extends Thread{
    /*
        需求：
        抢红包也用到了多线程。假设：100块，分成了3个包，现在有5个人去抢。
        其中，红包是共享数据。5个人是5条线程。
        打印结果如下：
        XXX抢到了XXX元
        XXX抢到了XXX元
         */
    static double money=100;
    static int count=3;
    //最小中奖金额
    static final double MIN=0.01;

    @Override
    public void run() {
        while(true){
            //同步代码块
            synchronized (MyThread.class){
                if(count==0){
                    //到了末尾
                    System.out.println(Thread.currentThread().getName()+"没有抢到红包");
                }else{
                    //没到末尾 还有3个红包可以抢

                    //定义一个变量，表示中奖的金额
                    double prize=0;
                    if(count==1){
                        //表示此时已经到了最后一个红包
                        //无需随机，剩下的所有钱就是第三个红包的金额
                        prize=money;
                    }else{
                        //前两个红包，需要随机金额
                        Random r=new Random();

                        //100元 3个红包
                        //最小 且符合要求的情况（即边界情况）：
                        //第1个 99.8
                        //第2个 0.01 最小MIN
                        //第三个 0.01 最小MIN
                        double bounds=money-(count-1)*MIN;
                        //在边界内随机红包金额
                        prize=r.nextDouble(bounds);

                        if(prize<MIN){
                            prize=MIN;
                        }
                    }
                    //从money中减去当前中奖的金额
                    money=money-prize;
                    //红包个数减少
                    count--;
                    //打印本次红包信息
                    System.out.println(Thread.currentThread().getName()+"抢到了"+prize+"元红包");
                }
            }
        }
    }
}
