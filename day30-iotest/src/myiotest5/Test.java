package myiotest5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {
        /*
        每个被点到的学生，再次被点到的概率在原先的基础上降低一半。
        例如：80个学生，点名5次，每次都点到a，概率变化情况如下：
        第一次每人概率：1.25%
        第二次a概率：0.625% 其他学生：1.2579%
        第三次a：0.3125    其他学生：1.261867%
         */
        //1.把文件中的学生信息 读取到内存
        ArrayList<Student> list=new ArrayList<>();
        BufferedReader br=new BufferedReader(new FileReader(new File("src/myiotest5/names.txt")));
        String line;
        while((line=br.readLine())!=null){
            String[] arr = line.split("-");
            //数组是字符串型，跟age和权重的类型不符，所以要强转
            Student stu=new Student(arr[0],arr[1],Integer.parseInt(arr[2]),Double.parseDouble(arr[3]));
            list.add(stu);
        }
        //关闭
        br.close();

        //2.计算权重的总和
        double weight=0;
        for (Student stu : list) {
            weight=weight+stu.getWeight();
        }

        //3.计算出每个人的实际占比 注意：要把计算后的结果存起来到数组中
        double[] arr=new double[list.size()];
        int index=0;
        for (Student stu : list) {
             arr[index]=stu.getWeight() / weight;
             index++;
        }

        //4.计算每个人的权重占比范围
        for (int i = 1; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i];
        }

        //5.随机抽取
        //获取一个0.0-1.0之间的随机数
        double number=Math.random();
        //判断number在arr中的位置
        //二分查找
        //返回值：负的插入点减一
        //获取number在数组中的位置
        int result = -Arrays.binarySearch(arr, number)-1;
        Student stu=list.get(result);

        //6.修改抽到的学生的权重
        double w = stu.getWeight() / 2;
        stu.setWeight(w);

        //7.把集合中更新过的数据 再写到文件中
        BufferedWriter bw=new BufferedWriter(new FileWriter(new File("src/myiotest5/names.txt")));
        for (Student s : list) {
            bw.write(s.toString());
            bw.newLine();
        }
        bw.close();
    }
}
