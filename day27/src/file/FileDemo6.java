package file;

import java.io.File;

public class FileDemo6 {
    public static void main(String[] args) {
        File dir=new File("d:\\java_code");

        //获取当前目录下的文件
        String[] names=dir.list();
        for (String name : names) {
            System.out.println(name);
        }

        File[] files=dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
