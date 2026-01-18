package test02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        //带概率的随机
        //需求：班级里有n个学生，要求在随机的时候，70%抽到男生，30%抽到女生

        //思路：创建一个集合，里面只存0，1，概率和题中要求的概率一样
        //再创建两个集合，专门存男生和女生

        //1.创建集合
        ArrayList<Integer> list=new ArrayList<>();
        //2.添加数据
        Collections.addAll(list,1,1,1,1,1,1,1);
        Collections.addAll(list,0,0,0);
        //3.打乱集合
        Collections.shuffle(list);
        //4.从list集合里面随机抽取0或1
        Random r=new Random();
        int index=r.nextInt(list.size());
        int number=list.get(index);
        System.out.println(number);
        //5.创建两个集合 分别来存储男生和女生
        ArrayList<String> boy=new ArrayList<>();
        ArrayList<String> girl=new ArrayList<>();

        Collections.addAll(boy,"范闲","范建","范统","杜子腾","宋合泛","侯笼藤","朱益群","朱穆朗玛峰");
        Collections.addAll(girl,"杜琦燕","袁明媛","李猜","田蜜蜜");
        //6.判断此时是从boy里面抽的还是从girl里面抽的
        if(number==1){
            //boy
            int boyIndex=r.nextInt(boy.size());
            System.out.println(boy.get(boyIndex));
        }else{
            int girlIndex=r.nextInt(girl.size());
            System.out.println(girl.get(girlIndex));
        }
    }
}
