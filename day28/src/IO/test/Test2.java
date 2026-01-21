package IO.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args)
    throws IOException {
        /*
            为了保证文件的安全性，就需要对原始文件进行加密存储，使用的时候再对其进行解密处理。
            加密原理：
                对原始文件中的每一个字节数据进行更改，然后将更改以后的数据存储到新的文件中。
            解密原理：
                读取加密之后的文件，按照加密的规则反向操作，变成原始文件。

             ^ : 异或
                 两边相同：false
                 两边不同：true

                 0：false
                 1：true

               100:1100100
               10: 1010

               1100100
             ^ 0001010
             __________
               1101110
             ^ 0001010
             __________
               1100100

        */
    }
    public static void encryptionAndReduction(File src,File dest)
        throws IOException{
        //创建输入流
        FileInputStream fis=new FileInputStream(src);
        //创建输出流
        FileOutputStream fos=new FileOutputStream(dest);

        int b;
        //循环读取
        while((b=fis.read())!=-1){
            //解密 往右移一位
            fos.write(b^2);
        }
        fos.close();
        fis.close();
    }
}
