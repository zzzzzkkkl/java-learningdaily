package IO.bytestream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamConstructor {
    public static void main(String[] args)
    throws FileNotFoundException {
        //文件输出流

        //1.创建文件
        File file=new File("a.txt");
        //2.文件传入 创建流对象
        //这样就创建了一个文件输出流
        FileOutputStream fos=new FileOutputStream(file);

        //使用文件名创建 文件输出流对象
        FileOutputStream fos1=new FileOutputStream("b.txt");

    }
}
