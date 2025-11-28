package homework.day15.question4;

public class Outer {
    //定义静态方法method，返回inter类型的对象
    public static Inter method(){
        //使用匿名内部类实现inter接口
        return new Inter() {
            @Override
            public void show() {
                System.out.println("HelloWord");
            }
        };
    }
}
