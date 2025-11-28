package com.itheima.test2;

import java.util.Random;

public class Role {
    //成员变量，属性
    private String name;
    private int blood;
    private char gender;
    private String face;
    //长相随机
    String[] boyfaces = {"风流俊雅", "器宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "亭亭玉立", "身材姣好", "相貌平平", "相貌简陋", "惨不忍睹"};
    //attack攻击描述
    String[] attack_desc={
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s",
            "%s大喝一声，身形下浮，一招【霹雷坠地】，锤向%s双腿",
            "%s运气于掌，一瞬间掌心变得通红，一式【掌心雷】，推向%s"
    };
    //injured受伤描述
    String[] injured_desc={
            "结果%s退了半步后发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛的弯下腰",
            "结果%s痛苦的闷哼了一声，显然受了点内伤"
    };
    //成员方法，行为
    //谁攻击谁？ r1攻击r2，r1调用攻击这个方法；即方法的调用者攻击参数
    public void attack(Role role) {
        Random r=new Random();
        int index=r.nextInt(attack_desc.length);
        String Kungfu=attack_desc[index];
        //输出一个攻击效果
        System.out.printf(Kungfu,this.getName(),role.getName());
        System.out.println();

        //计算造成的伤害1-20
        int hurt = r.nextInt(20) + 1;
        //挨揍的人剩下的血
        int remainBlood = role.getBlood() - hurt;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;//血为负数不合理，赋成0
        role.setBlood(remainBlood);//将挨揍人的血修改成新的值

        //this表示方法的调用者
        //受伤，剩余血量＞90，用0索引的描述
        if(remainBlood>90){
            System.out.printf(injured_desc[0],role.getName());
        }else if(remainBlood>80&&remainBlood<=90){
            System.out.printf(injured_desc[1],role.getName());
        }else if(remainBlood>70&&remainBlood<=80){
            System.out.printf(injured_desc[2],role.getName());
        }else{
            System.out.printf(injured_desc[3],role.getName());
        }
        System.out.println();
    }
    public void showRoleInfo() {
        System.out.println("姓名为：" + getName());
        System.out.println("血量为：" + getBlood());
        System.out.println("性别为：" + getGender());
        System.out.println("长相为：" + getFace());
    }

    //空参构造
    public Role() {
    }
    //带参构造
    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        //长相是随机的
        setFace(gender);
    }

    //set/get
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        //长相是随机的
        Random r = new Random();
        if (gender == '男') {
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if (gender == '女') {
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        } else {
            this.face = "面目狰狞";
        }
    }
}
