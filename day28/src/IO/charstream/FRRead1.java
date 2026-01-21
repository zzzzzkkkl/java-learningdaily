package IO.charstream;

import java.io.FileReader;
import java.io.IOException;

public class FRRead1 {
    public static void main(String[] args)
    throws IOException {
        //读取字符数据

        //使用文件名创建流对象
        FileReader fr=new FileReader("read.txt");
        //定义变量 保存数据
        int b;
        //循环读取
        while((b=fr.read())!=-1){
            System.out.println((char)b);
        }
        //关闭
        fr.close();
    }
}
