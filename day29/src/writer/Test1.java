package writer;

import java.io.*;

public class Test1 {
    public static void main(String[] args)
    throws IOException {
        //需求：将GBK编码的文本文件，转换为UTF-8编码的文本文件。
        /*
        思路：
        指定GBK编码的转换流，读取文本文件到内存
        使用UTF编码的转换流，写出文本文件到文件
         */
        //1.定义文件路径
        String src="file_gbk.txt";
        String dest="file_utf8.txt";
        //2.创建流对象
        InputStreamReader isr=new InputStreamReader(new FileInputStream(src),"GBK");
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream(dest),"UTF-8");
        //3.读取src到内存
        char[] arr=new char[1024];
        int len;
        while((len= isr.read())!=-1){
            osw.write(arr,0,len);
        }
        //4.关闭
        osw.close();
        isr.close();
    }
}
