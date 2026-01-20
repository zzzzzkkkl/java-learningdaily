package test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test7 {
    public static void main(String[] args) {
        //需求统计文件个数
        File file = new File("D:\\aaa\\src");
    }
    //返回值 键：后缀名 值：次数
    public static HashMap<String,Integer> getCount(File src){
        //定义map用来放统计结果
        HashMap<String,Integer> hm=new HashMap<>();
        //遍历文件夹
        File[] files=src.listFiles();
        for (File file : files) {
            if(file.isFile()){
                //是文件 加
                String name=file.getName();
                //把文件名字按\\.分隔开 放到arr数组里
                String[] arr=name.split("\\.");
                if(arr.length>=2){
                    String endName=arr[arr.length-1];
                    if(hm.containsKey(endName)){
                        //map集合里存在这个后缀

                        //获取当前这个后缀的文件有多少个
                        int count=hm.get(endName);
                        count++;
                        //更新后的值再放进去
                        hm.put(endName,count);
                    }else{
                        //map里不存在
                        hm.put(endName,1);
                    }
                }
            }else{
                /*
                如果只写递归，他们都是独立的hm，最终结果没办法合并
                 */
                //是文件夹 递归这个子文件夹

                //拿到子文件夹的统计结果
                HashMap<String,Integer> sonMap=getCount(file);
                //遍历这个子文件夹
                Set<Map.Entry<String,Integer>> entries=sonMap.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    //获取后缀
                    String key=entry.getKey();
                    //获取后缀对应的值
                    int value= entry.getValue();
                    //把子文件夹的数量合并到主统计集合中
                    if(hm.containsKey(key)){
                        //存在
                        int count=hm.get(key);
                        count=count+value;
                        hm.put(key,value);
                    }else{
                        //主集合中不存在 直接添加
                        hm.put(key,value);
                    }
                }
            }
        }
        return hm;
    }
}
