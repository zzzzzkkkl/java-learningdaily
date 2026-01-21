package IO.bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
    public static void main(String[] args)
    throws IOException {
        //图片复制

        //1.创建流对象
        //指定数据源
        FileInputStream fis=new FileInputStream("D:\\tses.jpg");
        //指定目的地
        FileOutputStream fos=new FileOutputStream("test_copy.jpg");

        //2.读写数据
        //定义数组
        byte[] b=new byte[1024];
        //定义长度
        int len;
        //循环读取
        while((len=fis.read(b))!=-1){
            fos.write(b,0,len);
        }

        //关闭
        fos.close();
        fis.close();

    }
}
