import java.util.Scanner;
import java.util.Stack;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        /*给定一个经过编码的字符串，返回它解码后的字符串。
        编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
        你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
        此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。
        测试用例保证输出的长度不会超过 105。
        示例 :
        输入：s = "3[a]2[bc]"
        输出："aaabcbc"
        */
        //键盘输入字符串
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        //初始化栈
        Stack<Integer> countStack=new Stack<>();//保存重复次数
        Stack<StringBuilder> strStack=new Stack<>();//保存括号前的字符串

        StringBuilder curr=new StringBuilder();//当前正在拼的字符串
        int  num=0;

        //遍历字符串
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                num=num*10+(c-'0');//处理多位数字。c-'0'把字符转换成数字，然后把字符串转换为整数
            }else if(c=='['){
                countStack.push(num);//保存重复次数
                strStack.push(curr);//保存当前字符串
                num=0;//重置num
                curr=new StringBuilder();//遇到一个[就把之前的字符串清空，开始新的字符串
            }else if(c==']'){
                int times=countStack.pop();//取出重复次数
                StringBuilder last=strStack.pop();//取出上一个字符串
                StringBuilder temp=new StringBuilder();
                for(int i=0;i<times;i++){
                    temp.append(curr);//重复拼接
                }
                curr=last.append(temp);//拼回上一层
            }else{
                curr.append(c);//普通字符直接加进去
            }
        }
        System.out.println(curr.toString());

    }
}