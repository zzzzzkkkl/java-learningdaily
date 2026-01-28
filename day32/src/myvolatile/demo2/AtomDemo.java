package myvolatile.demo2;

public class AtomDemo {
    public static void main(String[] args) {
        //原子性

        MyAtomThread atom=new MyAtomThread();
        for (int i = 0; i < 100; i++) {
            new Thread(atom).start();
        }
    }
}



class MyAtomThread implements Runnable{
    private volatile int count=0;//送冰淇淋的数量
    private Object lock = new Object();

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //1.从共享数据中读取数据到本线程栈中
            //2.修改本线程栈中变量副本的值
            //3.会把本线程中变量副本的值赋值给共享数据

            /*//这里的count++不是一个原子操作，他在执行的过程中，有可能被其他线程打断
            count++;
            System.out.println("已经送了"+count+"个冰淇淋");*/

            //这样count就变成临界区代码，临界区的代码一次只能被一个线程去执行
            //这样count就变成原子操作
            synchronized (lock){
                count++;
                System.out.println("已经送了"+count+"个冰淇淋");
            }
        }
    }
}
