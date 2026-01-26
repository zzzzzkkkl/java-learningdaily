package threadsync.demo5;

public class Demo {
    public static void main(String[] args) {
        //死锁

        Object objA=new Object();
        Object objB=new Object();

        new Thread(()->{
            while(true){
                //持有A
                synchronized (objA){
                    //线程一
                    //想要B
                    synchronized (objB){
                        System.out.println("小康正在走路");
                    }
                }
            }
        }).start();

        new Thread(()->{
            while(true){
                //持有B
                synchronized (objB){
                    //线程二
                    //想要A
                    synchronized (objA){
                        System.out.println("小薇同学正在走路");
                    }
                }
            }
        }).start();
    }
}
