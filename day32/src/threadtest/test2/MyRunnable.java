package threadtest.test2;

public class MyRunnable implements Runnable{
    /*
    需求：
    有100份礼品,两人同时发送，当剩下的礼品小于10份的时候则不再送出。
    利用多线程模拟该过程并将线程的名字和礼物的剩余数量打印出来.
     */
    //利用第二种方法创建多线程

    //第二种方法，测试类MyRunnable只创建一次，所以不需要加static
    int count=100;

    @Override
    public void run() {
        while(true){
            //同步的代码块
            synchronized (MyRunnable.class){
                //判断到末尾了
                if(count<10){
                    System.out.println("礼物还剩下"+count+"不再赠送");
                    break;
                }else{
                    //没有到末尾
                    count--;
                    System.out.println(Thread.currentThread().getName()+"在赠送礼物，还剩下"+count+"个礼物");
                }
            }
        }
    }
}
