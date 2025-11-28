package homework.day08;

public class question3manger {
    //属性,成员变量
    private String name;
    private int id;
    private int salary;
    private int bonus;
    //行为，成员方法
    public void work(){
        System.out.println("工号为"+id+"基本工资为"+salary+"奖金为"+bonus+"的项目经理"+name+"正在努力的工作...");
    }

    //空参构造
    public question3manger(){}
    //带参构造
    public question3manger(String name,int id,int salary,int bonus){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.bonus=bonus;
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
    public void setBonus(int bonus){
        this.bonus=bonus;
    }
    public int getonus(){
        return bonus;
    }
}
