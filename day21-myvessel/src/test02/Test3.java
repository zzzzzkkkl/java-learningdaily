package test02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        //随机不重复
        //需求：班级里有n个学生，被点到的学生不会再被点到。如果班级里
        //的学生都点完了，需要重新开启第二轮报名

        //思路：利用for循环控制点名的轮次，内里嵌套的for控制抽取的过程

        //1.定义集合
        ArrayList<String> list1=new ArrayList<>();
        //2.向集合中添加数据
        Collections.addAll(list1,"范闲", "范建", "范统", "杜子腾", "杜琦燕", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰", "袁明媛");
        //创建一个临时集合，用来存已经被点到的学生名字
        ArrayList<String> list2=new ArrayList<>();
        //外循环：表示轮数
        for(int i=1;i<=10;i++){
            System.out.println("=========第" + i + "轮点名开始了======================");
            //3.获取集合的长度
            int count=list1.size();
            //4.随机点名
            Random r=new Random();
            //内循环：每一轮中随机循环抽取的过程
            for(int j=0;j<count;j++){
                int index=r.nextInt(list1.size());
                //抽到谁 就利用remove把他从list里面剔除
                String name=list1.remove(index);
                //把抽到的这个加到list2里面
                list2.add(name);
                System.out.println(name);
            }
            //一轮点名结束
            //list1空 list2满，把list2里面的数据填到list1
            list1.addAll(list2);
            list2.clear();
        }
    }
}
