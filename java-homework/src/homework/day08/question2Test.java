package homework.day08;

public class question2Test {
    public static void main(String[] args) {
        /*定义一个女朋友类。属性：姓名、身高、体重；行为：休息、吃饭；
        再定义一个show方法用于展示三个属性。

        定义一个测试类。有参构造创建对象并赋值，然后分别调用展示方法、休息和吃饭方法
        打印效果如下：
        我女朋友叫小诗诗，身高165厘米，体重100斤
        女朋友在休息
        女朋友在吃饭
         */
        //有参构造创建对象，赋值
        question2 gf=new question2("小诗诗",165.0,100);
        gf.show();
    }
}
