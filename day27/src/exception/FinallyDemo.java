package exception;

import java.io.FileNotFoundException;

public class FinallyDemo {
    public static void main(String[] args) {
        //finally代码块

        try{
            read("a.text");
        }catch(FileNotFoundException e){
            //抓到编译时异常 抛出去的是与运行时
            throw new RuntimeException(e);
        }finally{
            System.out.println("最终一定被执行");
        }
        System.out.println("over");
    }
    public static void read(String path) throws FileNotFoundException {
        if (!path.equals("a.txt")) {//如果不是 a.txt这个文件
            // 我假设  如果不是 a.txt 认为 该文件不存在 是一个错误 也就是异常  throw
            throw new FileNotFoundException("文件不存在");
        }
    }
}
