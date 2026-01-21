package IO.bytestream;

import java.io.FileInputStream;
import java.io.IOException;

public class FISRead {
    public static void main(String[] args)
    throws IOException {
        //字节输入流 读取字节数据

        //使用文件名 创建一个文件输入流
        FileInputStream fis=new FileInputStream("read.txt");
        /*//读取数据，返回一个字节
        int read=fis.read();
        System.out.println(read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);
        read = fis.read();
        System.out.println((char) read);

        //读取到末尾 返回-1
        read=fis.read();
        System.out.println(read);*/

        //定义变量，保存数据
        int b;
        //循环读取
        while((b=fis.read())!=-1){
            System.out.println((char)b);
        }

        //关闭
        fis.close();
    }
}
