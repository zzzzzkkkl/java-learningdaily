package com.ithiema.studentsystemupgraded;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        while (true) {
            System.out.println("--------------欢迎来到学生管理系统-------------");
            System.out.println("请选择操作1登录 2注册 3忘记密码");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            switch (choose) {
                case 1 -> enter(list);
                case 2 -> register(list);
                case 3 -> forgetPassword(list);
                default -> System.out.println("没有这个选项");
            }
        }
    }

    //方法2 注册
    public static void register(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        String name;
        String password1;
        String id;
        String phoneNum;
        //用户名
        while (true) {
            System.out.println("请输入用户名（长度在3-15之间，只能是数字加字母的组合）");
            name = sc.next();
            boolean flag1 = contains(name, list);
            boolean flag2 = isAllNumber(name);
            boolean flag3 = isLetterOrNum(name);
            //先判断格式，再判断唯一性，如果格式不对就没有必要判断了
            if (name.length() > 15 && name.length() < 3) {
                System.out.println("用户名超过15位或低于3位，不符合要求，请重新输入");
            } else if (flag3) {
                System.out.println("用户名只能是数字加字母组合，请重新输入");
            } else if (flag2) {
                System.out.println("用户名不能是纯数字组合，请重新输入");
                //判断唯一性
            } else if (flag1) {
                System.out.println("用户名已存在，请重新输入");
            } else {
                System.out.println("用户名输入成功");
                break;
            }
        }
        //密码
        while (true) {
            System.out.println("请输入密码：");
            password1 = sc.next();
            System.out.println("请再次输入密码：");
            String password2 = sc.next();
            if (password1.equals(password2)) {
                System.out.println("密码正确");
                break;
            } else {
                System.out.println("两次密码不一致，请重新输入");
            }
        }
        //身份证号
        while (true) {
            System.out.println("请输入身份证号：");
            id = sc.next();
            boolean flagId = checkId(id);
            if (flagId) {
                System.out.println("输入的身份证号不足18位、或首位为0、或前17为非纯数字，请重新输入");
            } else {
                System.out.println("身份证号输入成功");
                break;
            }
        }
        //手机号
        while (true) {
            System.out.println("请输入手机号");
            phoneNum = sc.next();
            boolean flagPhone = checkPhoneNum(phoneNum);
            if (flagPhone) {
                System.out.println("输入的电话号码不正确，请重新输入");
            } else {
                System.out.println("电话号码输入成功");
                break;
            }
        }
        //把用户名、密码、身份证号、手机号放到用户对象里面
        User user = new User(name, password1, id, phoneNum);
        //把用户放到集合里面
        list.add(user);
        System.out.println("注册成功");
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            System.out.println(u.getUsername() + " " + u.getPassword() + " " + u.getId() + " " + u.getPhoneNum());
        }
    }

    //方法1 登录
    public static void enter(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            //获取验证码
            String realCode = "";
            Random r = new Random();
            int num = r.nextInt(10);
            char arr[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                    'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                    'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
                    'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
            for (int j = 0; j < 4; j++) {
                int index = r.nextInt(52);
                realCode = realCode + arr[index];
            }
            realCode = realCode + num;
            realCode = rotate(realCode);
            System.out.println("验证码是：" + realCode);

            //判断用户是否存在
            System.out.println("请输入用户名：");
            String name = sc.next();
            int index = getIndex(name, list);
            if (index < 0) {
                System.out.println("用户未注册，请先注册后再登录");
                return;
            }
            System.out.println("请输入密码:");
            String password = sc.next();

            //判断验证码是否正确
            while (true) {
                System.out.println("请输入验证码：");
                String code = sc.next();
                //验证码的比较不看大小写
                if (realCode.equalsIgnoreCase(code)) {
                    System.out.println("验证码正确");
                    break;
                } else {
                    System.out.println("验证码错误，请重新输入");
                }
            }

            //判断密码是否正确
            User user = new User(name, password, null, null);
            String realPassword = list.get(index).getPassword();
            if (user.getPassword().equals(realPassword)) {
                System.out.println("登录成功,可以开始使用学生管理系统");
                //创建对象，调用方法，启动学生管理系统
                StudentSystem ss=new StudentSystem();
                ss.startStudentSystem();
                break;
            } else {
                System.out.println("登录失败，用户名或密码错误");
                if (i == 2) {
                    System.out.println("当前账号" + user.getUsername() + "被锁定，请联系客服解决");
                    //三次机会用尽，账号被锁定，结束循环
                    return;
                } else {
                    System.out.println("用户名或密码错误，还剩下" + (2 - i) + "次机会");
                }
            }
        }
    }

    //方法3 忘记密码
    public static void forgetPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = sc.next();
        int index = getIndex(name, list);
        if (index < 0) {
            System.out.println("当前用户未注册,请先注册");
            return;
        }
        //用户存在，继续输身份证号
        System.out.println("请输入身份证号");
        String id = sc.next();
        System.out.println("请输入手机号");
        String phoneNum = sc.next();

        User user = list.get(index);
        String realId = user.getId();
        String realPhoneNum = user.getPhoneNum();
        if (!(realId.equals(id) && realPhoneNum.equals(phoneNum))) {
            System.out.println("账号信息不匹配，修改失败");
            return;
        }
        //当代码执行到这，证明可以修改密码，直接修改即可
        String password;
        while (true) {
            System.out.println("请输入新密码");
            password = sc.next();
            System.out.println("请再次输入新密码");
            String againPassword= sc.next();
            if(password.equals(againPassword)){
                System.out.println("密码输入一致");
                break;
            }else{
                System.out.println("两次密码不一致，请重新输入");
            }
        }
        user.setPassword(password);
        System.out.println("密码修改成功");
    }

//判断是否唯一的方法
public static boolean contains(String name, ArrayList<User> list) {
        /*for (int i = 0; i < list.size(); i++) {
            User user=list.get(i);
            String username= user.getUsername();
            if(username.equals(name)){
                return true;
            }
        }
        return false;*/
    return getIndex(name, list) >= 0;
}

//根据用户名找到对应的索引
public static int getIndex(String name, ArrayList<User> list) {
    for (int i = 0; i < list.size(); i++) {
        User user = list.get(i);
        String username = user.getUsername();
        if (username.equals(name)) {
            return i;
        }
    }
    return -1;
}

//用户名不能是纯数字
public static boolean isAllNumber(String name) {
    int count = 0;
    for (int i = 0; i < name.length(); i++) {
        char c = name.charAt(i);
        if (c <= '9' && c >= '0') {
            count++;
        }
    }
    if (count == name.length()) {
        return true;
    } else {
        return false;
    }
}

//用户名只能是字母和数字组合
public static boolean isLetterOrNum(String name) {
    for (int i = 0; i < name.length(); i++) {
        char c = name.charAt(i);
        if (!((c <= 'z' && c >= 'a') || (c <= 'Z' && c >= 'A') || (c <= '9' && c >= '0'))) {
            return true;
        }
    }
    return false;
}

//判断身份证号是否符合要求
public static boolean checkId(String id) {
    //先判断格式，再判断内容
    if (id.length() != 18) {
        return true;
    }
    if (id.charAt(0) == '0') {
        return true;
    }
    for (int i = 0; i < id.length() - 1; i++) {
        char c = id.charAt(i);
        if (c > '9' || c < '0') {
            return true;
        }
    }
    char last = id.charAt(id.length() - 1);
    if ((last <= '9' && last >= '0') || last == 'x' || last == 'X') {
        return false;
    } else {
        return true;
    }
}

//判断手机号是否符合规则
public static boolean checkPhoneNum(String phoneNum) {
    if (phoneNum.length() != 11) {
        return true;
    }
    if (phoneNum.charAt(0) == '0') {
        return true;
    }
    for (int i = 0; i < phoneNum.length(); i++) {
        char c = phoneNum.charAt(i);
        if (c > '9' || c < '0') {
            return true;
        }
    }
    return false;
}

//将真验证码打乱排序(即将数字num和任意一个字母换位置）
public static String rotate(String code) {
    Random r = new Random();
    //把字符串变成字符数组
    char[] arr = code.toCharArray();
    for (int i = 0; i < arr.length; i++) {
        int index = r.nextInt(arr.length);
        char temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }
    //把字符数组变成字符串
    String newArr = new String(arr);
    return newArr;
  }
}
