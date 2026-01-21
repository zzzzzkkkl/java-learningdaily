package IO.charstream;

import java.io.FileWriter;
import java.io.IOException;

public class HandleException2 {
    public static void main(String[] args) {
        //创建流对象
        try(FileWriter fw=new FileWriter("fw.txt")){
            //写出数据
            fw.write("坚定勇敢");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
