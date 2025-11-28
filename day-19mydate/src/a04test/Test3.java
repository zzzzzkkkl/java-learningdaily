package a04test;

public class Test3 {
    public static void main(String[] args) {
        /*定义一个方法，将一个十进制数转化成二进制数
         */

        toBinaryString(6);
    }
    public static String toBinaryString(int number){
        //除2取余法,直到商为0结束
        //把余数倒着拼接起来

        //定义一个StringBuilder用来拼接余数
        StringBuilder sb=new StringBuilder();
        //利用循环不断除2
        while(true){
            if(number==0){
                break;
            }
            //获取余数 如果是先除2 eg.6除2先得到3，再获取余数，就是1了，而不是0
            int remainder=number%2;
            //将余数倒着拼接 即每得到一个新余数，就将她放到前面
            sb.insert(0,remainder);//insert 第一个参数是插入的位置
            //除以2
            number=number/2;
        }
        return sb.toString();
    }
}
