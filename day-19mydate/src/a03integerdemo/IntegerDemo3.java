package a03integerdemo;

public class IntegerDemo3 {
    public static void main(String[] args) {
        //键盘录入
        //弊端：
        //Scanner使用next、nextInt接收数据时，遇到空格、回车，制表符的时候就停止
        //键盘录入的是123 123，那么此时只能接收到空格前的数据
        //接收一整行数据时
        //约定：
        //如果需要键盘输入，不管什么类型，统一使用nextLine
        //特点：遇到回车才停止
    }
}
