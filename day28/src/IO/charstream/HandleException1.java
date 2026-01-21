package IO.charstream;

import java.io.FileWriter;
import java.io.IOException;

public class HandleException1 {
    public static void main(String[] args) {
        //声明变量
        FileWriter fw=null;
        try{
            //创建流对象
            fw=new FileWriter("fw.txt");
            //写出数据
            fw.write("功成名就");
        }catch(IOException e){
            //打印错误信息
            e.printStackTrace();
        }finally{
            try{
                if(fw!=null){
                    fw.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
