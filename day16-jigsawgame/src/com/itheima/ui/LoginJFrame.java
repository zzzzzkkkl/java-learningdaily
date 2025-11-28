package com.itheima.ui;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

public class LoginJFrame extends JFrame implements MouseListener {
    //添加登录按钮
    JButton login=new JButton();
    //添加注册按钮
    JButton register=new JButton();
    //添加用户名输入框
    JTextField username=new JTextField();
    //添加密码输入框
    JTextField password=new JTextField();
    //添加验证码输入框
    JTextField code=new JTextField();

    //获取正确验证码,否则每点击一次登录按钮，就会再生成一个新的验证码却不在界面上显示出来
    String rightCode;
    //存储验证码的JLabel
    JLabel codeLabel;

    //创建一个集合，存储正确的登录名和密码
    static ArrayList<User> list=new ArrayList<>();
    static {
        list.add(new User("zhangsan","123"));
        list.add(new User("lisi","1234"));
    }

    //把登录界面的设置写在构造方法里,这里相当于空参构造。构造方法就是创建对象时进行初始化的
    public LoginJFrame(){
        //1.初始化登录界面
        initJFrame();
        //2.向界面中添加内容 登录按钮等
        initView();
        //让当前界面显示出来
        this.setVisible(true);
    }

    //2.向界面中添加内容
    private void initView() {
        //注意：添加时直接把宽高等设置好
        //添加用户名文字图片
        //添加图片时要先把图片放在JLabel图片管理器里，然后再把JLabel放在界面里
        JLabel userNameText=new JLabel(new ImageIcon("image/login/用户名.png"));
        userNameText.setBounds(116,135,47,17);
        this.getContentPane().add(userNameText);
        //设置用户名输入框的参数
        username.setBounds(195,134,200,30);
        this.getContentPane().add(username);
        //添加密码文字图片
        JLabel passwordText=new JLabel(new ImageIcon("image/login/密码.png"));
        passwordText.setBounds(130,195,32,16);
        this.getContentPane().add(passwordText);
        //设置密码输入框的参数
        password.setBounds(195,195,200,30);
        this.getContentPane().add(password);

        //添加验证码图片
        JLabel codeText=new JLabel(new ImageIcon("image/login/验证码.png"));
        codeText.setBounds(133,256,50,30);
        this.getContentPane().add(codeText);
        //设置验证码输入框的参数
        code.setBounds(195,256,100,30);
        this.getContentPane().add(code);
        //给输入框右边添上正确的验证码图片
        codeLabel=new JLabel();
        codeLabel.setText(rightCode);//初始化界面时直接把生成的正确验证码放上去
        codeLabel.setBounds(300,256,50,30);
        this.getContentPane().add(codeLabel);
        initCode();

        //设置登录按钮的参数
        login.setBounds(123,310,128,47);
        login.setIcon(new ImageIcon("image/login/登录按钮.png"));//设置登录按钮的图片
        login.setBorderPainted(false);//抠掉按钮图片的默认边框
        login.setContentAreaFilled(false);//抠掉按钮图片带的背景
        this.getContentPane().add(login);
        //设置注册按钮的参数
        register.setBounds(256,310,128,47);
        register.setIcon(new ImageIcon("image/login/注册按钮.png"));//设置注册按钮的图片
        register.setBorderPainted(false);//抠掉按钮图片的默认边框
        register.setContentAreaFilled(false);//抠掉按钮图片带的背景
        this.getContentPane().add(register);

        //为按钮绑定鼠标监听
        login.addMouseListener(this);
        register.addMouseListener(this);

        //添加背景图片
        JLabel background=new JLabel(new ImageIcon("image/login/background.png"));
        background.setBounds(0,0,470,390);
        this.getContentPane().add(background);
    }

    //初始化验证码
    private void initCode(){
        rightCode=getCode();
        codeLabel.setText(rightCode);
    }

    //获取验证码 四位随机字母（大小写均可）＋一位数字
    private static String getCode() {
        String code="";
        //把26个大写字母和26个小写字母放在数组中
        char[] arr={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r',
        's','t','u','v','w','x','y','z',
                'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R',
                'S','T','U','V','W','X','Y','Z',};
        //4个随机数，找到对应的元素
        Random r=new Random();
        for (int i = 0; i < 4; i++) {
            int index=r.nextInt(arr.length);
            code=code+arr[index];
        }
        //1个随机数和4个字母拼在一起
        int num=r.nextInt(10);
        code=code+num;

        //将拼好的验证码字符串打乱,每个元素都和随机数对应的索引交换位置
        //先把拼好的字符串变成字符数组
        char[] codeStr=code.toCharArray();
        for (int i = 0; i < codeStr.length; i++) {
            int index=r.nextInt(codeStr.length);
            char temp=codeStr[i];
            codeStr[i]=codeStr[index];
            codeStr[index]=temp;
        }
        //再把字符数组变回字符串
        String result=new String(codeStr);
        return result;
    }

    //1.初始化界面
    private void initJFrame() {
        //创建登录界面时，同时给这个界面设置一些信息
        this.setSize(488,430);
        //设置界面的标题
        this.setTitle("拼图 登录");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        this.setVisible(true);//创建的界面默认隐藏，要用setVisiable函数把他显示出来
    }

    //展示用户名或密码错误
    public void showJDialog(String content){
        //创建弹框
        JDialog jDialog=new JDialog();
        jDialog.setSize(200,150);
        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);//让弹框居中
        jDialog.setModal(true);//弹框不关闭无法操作下面的界面

        //创建JLabel对象来管理文字，把它放到弹框里
        JLabel warning=new JLabel(content);
        warning.setBounds(0,0,200,150);
        jDialog.getContentPane().add(warning);

        //让弹框显示出来
        jDialog.setVisible(true);
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    //鼠标按下按钮时
    @Override
    public void mousePressed(MouseEvent e) {
        //判断按下的是什么按钮
        Object obj=e.getSource();
        if(obj==login){
            //按下登录按钮，图片变灰
            login.setIcon(new ImageIcon("image/login/登录按下.png"));
            //判断输入的验证码、用户名、密码是否正确，即判断是否登录成功
            isLoginWin();
        }else if(obj==register){
            //按下注册按钮，图片变灰
            register.setIcon(new ImageIcon("image/login/注册按下.png"));
            //触发注册
            new RegisterJFrame();
        }
    }

    //判断是否登录成功
    private void isLoginWin() {
        //获取输入框中用户输入的内容
        String userCode=code.getText();
        String userName=username.getText();
        String userPassword=password.getText();
        //获取用户名对应的索引
        int index=getIndex(userName,list);

        //先判断验证码是否正确，不正确就没必要进行下一步判断
        if(!(rightCode.equalsIgnoreCase(userCode))){
            //验证码不正确，弹出弹框提示用户
            showJDialog("验证码错误，请重新输入");
            //刷新验证码
            initCode();
            //不用再更新整个页面，因为initCode里面带的有JLabel这个组件，这个一更新就不用更新整个界面
        }else if(index<0){
            showJDialog("用户未注册，请先注册再登录");
        } else if (!((list.get(index).getPassword()).equals(userPassword))){
            showJDialog("密码不正确，请重新输入");
        }else{
            //重新登录成功进入游戏页面
            new GameJFrame();
        }
    }

    //判断用户名是否在集合中存在
    private boolean contains(String userName,ArrayList<User> list) {
        /*for (int i = 0; i < list.size(); i++) {
            User u=list.get(i);
            String rightName=u.getName();
            if(userName.equals(rightName)){
                return true;
            }
        }
        return false;*/
        return getIndex(userName, list)>=0;
    }
    //通过用户名获取它在集合中对应的索引
    private int getIndex(String userName,ArrayList<User> list){
        for (int i = 0; i < list.size(); i++) {
            User u=list.get(i);
            String rightName=u.getName();
            if(userName.equals(rightName)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
