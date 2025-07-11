public class VariableTest{
    public static void main(String[] args){
        //计算公交车的人数？
        //一开始没有乘客
        int count=0;
        // 第一站上去一位乘客
        //在原有基础上+1
        count=count+1;
        // 第二站上去两位乘客下来一位乘客
        count=count+2-1;
        // 第三站上去两位乘客下来一位乘客
        count=count+2-1;
        //第四站下来一位乘客
        count=count-1;
        // 第五站上去一位乘客，终点站车上还有几位乘客？
        count=count+1;
        System.out.println(count);
    }
}