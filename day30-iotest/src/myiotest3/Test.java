package myiotest3;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws IOException {
        /*有概率的随机点名器
        需求：
            一个文件里面存储了班级同学的信息，格式为：张三-男-23
            每一个学生信息占一行。
            要求通过程序实现随机点名器。
            70%的概率随机到男生
            30%的概率随机到女生
            随机100万次，统计结果。看生成男生和女生的比例是不是接近于7：3
         */
        //思路：将数据按行读取到内存-分割成数组-将男女分开存放-0到9随机抽一个数，抽到哪个就选arr的哪个数
        //-1就在男生里抽一个 0就在女生里抽一个
        //1.定义一个数组 男1 女0 按7：3的概率
        int[] arr={1,1,1,1,1,1,1,0,0,0};
        //2.定义一个集合，用来存读到的数据
        ArrayList<String> list=new ArrayList<>();
        //3.定义缓冲输入流 按行读取
        BufferedReader bw=new BufferedReader(new FileReader(new File("names.txt")));
        String ch;
        while((ch=bw.readLine())!=null){
            list.add(ch);
        }
        //关闭
        bw.close();
        //4.定义一个男生集合 再定义一个女生集合
        ArrayList<String> boyList=new ArrayList<>();
        ArrayList<String> girlList=new ArrayList<>();
        //5.遍历总的集合list 按-分割 看是男生还是女生
        for (String s : list) {
            String[] arr2=s.split("-");
            if(arr2[1].equals("男")){
                //是男生就把男生的名字放进男生集合
                boyList.add(arr2[0]);
            }else{
                girlList.add(arr2[0]);
            }
        }
        //6.随机
        Random r=new Random();
        int index=r.nextInt(arr.length);
        //判断抽到的是男生还是女生
        if(arr[index]==1){
            //在男生集合里抽一个
            System.out.println(randomDrawName(boyList));
        }else{
            //在女生集合里抽一个
            System.out.println(randomDrawName(girlList));
        }
    }
    public static String randomDrawName(ArrayList<String> list){
        Random r=new Random();
        int index=r.nextInt(list.size());
        return list.get(index);
    }
}
