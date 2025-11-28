package homework.day08;

public class question3Test {
    public static void main(String[] args) {
        /*定义项目经理类Manger类。属性：姓名、工号id、工资salary、奖金bonus；行为：工作。
        定义程序员类Code。属性：姓名、工号、工资；行为：工作。

        创建对象并赋值用set或者有参构造，调用成员方法，格式如下：
        工号为123基本工资为15000，奖金为6000的项目经理张三正在努力的做着管理工作，分配任务，检查员工
        提交上来的代码...
        工号135基本工资为10000的程序员李四正在努力的写着代码
         */
        question3manger m=new question3manger("张三",123,15000,6000);
        question3coder c=new question3coder("李四",135,1000);
        m.work();
        c.work();
    }
}
