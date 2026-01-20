package exception;

import java.io.FileNotFoundException;

public class TryCatchDemo {
    public static void main(String[] args) {
        //捕获异常

        try{
            //可能出现异常的代码
            read("b.text");
        }catch(FileNotFoundException e){//try中抛出什么类型的异常，这里就定义一样的
            System.out.println(e);
        }
        System.out.println("over");
    }
    //当前方法 编译时异常
    public static void read(String path)
        throws FileNotFoundException{
        if(!path.equals("a.text")){
            //如果不是a这个文件
            //就认为出现异常 抛出文件不存在这个异常
            throw new FileNotFoundException("文件不存在");
        }
    }
}
