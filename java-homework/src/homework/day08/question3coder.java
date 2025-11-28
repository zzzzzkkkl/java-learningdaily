package homework.day08;

public class question3coder {
    //属性,成员变量
    private String name;
    private int id;
    private int salary;
    //行为，成员方法
    public void work(){
        System.out.println("工号为"+id+"基本工资为"+salary+"的程序员"+name+"正在努力的写代码...");
    }

    //空参构造
    public question3coder(){}
    //带参构造
    public question3coder(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    //set/get
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getSalary(){
        return salary;
    }
}
