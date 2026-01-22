package serialize;

import java.io.Serializable;

public class Student implements Serializable {
    //加入版本序列号
    private static final long serialVersionUID= 1L;
    public String name;
    public String pwd;
    //添加新的属性，重新编译，可以反序列化，该属性赋为默认值
    public int eid;

    public Student() {
    }

    public Student( String name, String pwd, int eid) {
        this.name = name;
        this.pwd = pwd;
        this.eid = eid;
    }

    public void studentCheck(){
        System.out.println("Student check:"+name+"--"+pwd);
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 设置
     * @param pwd
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * 获取
     * @return eid
     */
    public int getEid() {
        return eid;
    }

    /**
     * 设置
     * @param eid
     */
    public void setEid(int eid) {
        this.eid = eid;
    }

    public String toString() {
        return "Student{serialVersionUID = " + serialVersionUID + ", name = " + name + ", pwd = " + pwd + ", eid = " + eid + "}";
    }
}
