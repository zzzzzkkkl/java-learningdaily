import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*小红定义一个数组是好数组，当且仅当该数组中有且仅有一个元素和其他元素不同，剩余的所有元素相同。
        例如，[2,2,2,5,2,2]是好数组。
        小红拿到了一个数组，她可以进行若干次操作，每次操作可以使得一个元素加 1 或者减 1 。小红希望用尽可能少的操作次数使得该数组变成好数组
        输入描述：
        第一行输入一个正整数 n，代表数组的大小。
        第二行输入 n 个正整数 a_i，代表数组的元素。
        输出描述：
        一个整数，代表最小的操作次数。*/
        //1.键盘输入数组
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //键盘输入数组长度
        int[] arr=new int[n];
        //遍历数组，键盘输入数组元素
        for (int i = 0; i < arr.length; i++) {
            int num=sc.nextInt();
            arr[i]=num;
        }

        int minCost=Integer.MAX_VALUE;//Intger：int java标准类，表示int型最大整数.常用来初始化最小值比较

        //假设第i个数是唯一不同的
        for (int i = 0; i < arr.length; i++) {
            //创建一个哈希表map，简和志都是Interger整型。用来统计key这个数字出现几次，key：数字，value：出现次数
            HashMap<Integer,Integer>map=new HashMap<>();
            for (int j = 0; j < arr.length; j++) {
                if(j==i) continue;//跳过j=i，遍历arr中其他元素
                //put：把键值对放入哈希表中
                //getOrDefault：如果没有该key，返回defaultValue
                //根据指定的key即arr[j]，获得对应的value。第一次map中没有这个key所以是0，加一后放进map中
                map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            }

            //找到出现最多的数
            int target=arr[0];
            int maxCount=0;
            //keySet（）：返回所有键的集合，用于遍历。这里也就是返回当前枚举中除i之外出现过的数字
            for(int key:map.keySet()){
                //get:取出key对应的value，如果没有就返回null
                //逐个查看数字出现的次数
                if(map.get(key)>maxCount){
                    maxCount=map.get(key);
                    target=key;
                }
            }

            //算操作次数
            int cost=0;
            for (int j = 0; j < arr.length; j++) {
                if(j==i) continue;
                cost+=Math.abs(arr[j]-target);//abs：绝对值
            }
            minCost=Math.min(minCost,cost);
        }

        //特殊情况，所有数都相等
        boolean allEqual=true;//allEqual:是否全部相等
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=arr[0]){
                allEqual=false;
                break;
            }
        }
        if(allEqual) minCost=1;
        System.out.println(minCost);
    }
}