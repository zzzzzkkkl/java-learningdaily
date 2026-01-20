package exception;

import java.io.FileNotFoundException;

public class ThrowsDemo1 {
    public static void main(String[] args)
    throws FileNotFoundException{
        //声明异常
        read("a.text");
    }
    //如果定义功能时有问题需要报告给调用者，可以通过在方法上使用throws关键字进行声明
    public static void read(String path)
    throws FileNotFoundException {
        if(!path.equals("a.text")){
            //如果文件不是a.text这个文件
            //认为 该文件不存在 是一个错误 也就是发生异常
            throw new FileNotFoundException("文件不存在");
        }
    }
}
