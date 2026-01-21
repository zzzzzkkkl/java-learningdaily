package IO.charstream;

import java.io.FileReader;
import java.io.IOException;

public class FRRead2 {
    public static void main(String[] args)
    throws IOException {
        //使用字符数组读取

        //使用文件名创建流对象
        FileReader fr=new FileReader("read.txt");
        //定义变量，保存有效字符个数
        int len;
        //定义字符数组
        char[] cbuf=new char[2];
        /*//循环读取
        while((len=fr.read(cbuf))!=-1){
            System.out.println(new String(cbuf));
        }*/

        //改进后的
        //循环读取
        while((len=fr.read(cbuf))!=-1){
            System.out.println(new String(cbuf,0,len));
        }
        //关闭
        fr.close();
    }
}
