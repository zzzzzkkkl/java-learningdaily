import java.util.Scanner;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        /*小红定义一个字符串的权值为：极长“连续段”的数量。所谓极长“连续段”，指尽可能长的一段字符全部相同的连续子串。例如，"1100111" 共有 3 个连续段："11"、"00" 和 "111"，所以权值为 3。
现在小红拿到了一个 01 串，小红希望你帮她求出所有子串的权值之和。
输入描述：
第一行输入一个正整数 n ，代表字符串的长度。
第二行输入一个长度为 n ，且仅由 '0' 和 '1' 两种字符组成的字符串。
输出描述：
一个正整数，代表所有子串的权值之和。*/
        //键盘输入字符串的长度，输入字符串
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        int total=0;

        //枚举所有子串的起始位置i
        for (int i = 0; i < str.length(); i++) {
            //枚举所有子串的结束位置j j>=i
            for(int j=i;j<str.length();j++){
                //计算子串的权值
                int count=1;//至少有一个连续段
                //在子串上计算权值
                for(int k=i+1;k<=j;k++){
                    if(str.charAt(k)!=str.charAt(k-1)){
                        count++;
                    }
                }
                total+=count;
            }
        }
        System.out.println(total);
    }
}