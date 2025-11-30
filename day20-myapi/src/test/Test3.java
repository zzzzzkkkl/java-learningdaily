package test;

public class Test3 {
    public static void main(String[] args) {
        /*有一堆桃子，猴子第一天吃了其中的一半，并多吃了一个！
        以后每天猴子都支持剩下的一半，然后再多吃一个
        第十天的时候还没吃，发现只剩下一个桃子。请问总共有多少个桃子

        day10:1
        day9：（day10+1)*2

        每一天的桃子数量都是后一天数量加1，乘2
         */
        getCount(1);
    }
    public static int getCount(int day){
        if(day<=0||day>=11){
            System.out.println("当前时间错误");
            return -1;
        }
        //递归
        if(day==10){
            return 1;
        }
        return (getCount(day+1)+1)*2;
    }
}
