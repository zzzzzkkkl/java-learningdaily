package IO.charstream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterConstructor {
    public static void main(String[] args)
    throws IOException {
        //使用File对象创建流对象
        File file=new File("a.txt");
        FileWriter fw=new FileWriter(file);

        //使用文件名创建流对象
        FileWriter fw1=new FileWriter("b.txt");
    }
}
