package threadtest.test3;

public class MyRunnable implements Runnable{
    /*
    需求：
    同时开启两个线程，共同获取1-100之间的所有数字。
    将输出所有的奇数。
     */

    int number=1;
    @Override
    public void run() {
        while(true){
            //同步代码块
            synchronized (MyRunnable.class){
                if(number>100){
                    break;
                }else{
                    if(number%2==1){
                        System.out.println(Thread.currentThread().getName()+"打印数字"+number);
                    }
                    number++;
                }
            }
        }
    }
}
