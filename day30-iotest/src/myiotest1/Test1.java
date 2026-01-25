package myiotest1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) throws IOException {
        /*
        制造假数据：
        获取姓氏：https://baijiaxing.hao86.com/
        男生名字：https://www.meimeiming.com/zhouyi/5143.html
        女生名字：https://xuminhao.com/mz/20751.html
         */

        //1.定义变量 记录网址
        String familyNameNet="https://baijiaxing.hao86.com/";
        String boyNameNet="https://www.meimeiming.com/zhouyi/5143.html";
        String girlNameNet="https://xuminhao.com/mz/20751.html";
        //2.爬取网址中的数据 其实就是把网址中的数据拼接成完整的字符串
        String familyNameStr=webCrawler(familyNameNet);
        String boyNameStr=webCrawler(boyNameNet);
        String girlNameStr=webCrawler(girlNameNet);
        //3.通过正则表达式，把其中符合要求的数据获取出来
        ArrayList<String> famiylNameTempList= getData(familyNameStr,"([\\\\u4E00-\\\\u9FA5])",1);
        ArrayList<String> boylNameTempList= getData(boyNameStr,"([\\u4E00-\\u9FA5]{2})、",1);
        ArrayList<String> girllNameTempList= getData(girlNameStr,"([\\u4E00-\\u9FA5]{2}) ",1);
        //4.处理数据
        //姓氏 每个都拆开 添加到新的集合
        ArrayList<String> famiylNameList=new ArrayList<>();
        for (String str : famiylNameTempList) {
            //str:赵钱孙礼
            //再遍历这个str 依次获取里面的每个元素
            for (int i = 0; i < str.length(); i++) {
                char c=str.charAt(i);
                // 去重添加
                if (!famiylNameList.contains(c + "")) {
                    famiylNameList.add(c + "");
                }
            }
        }

        //男生名字 去除重复元素即可
        ArrayList<String> boyNameList=new ArrayList<>();
        for (String str : boylNameTempList) {
            if(!boyNameList.contains(str)){
                boyNameList.add(str);
            }
        }

        //女生名字 把里面的每个元素用空格切割 得到每个女生的名字
        ArrayList<String> girlNameList=new ArrayList<>();
        for (String str : girllNameTempList) {
            String[] arr=str.split(" ");
            //遍历得到的名字数组
            for (String s : arr) {
                //将名字放进最后的集合中
                girlNameList.add(s);
            }
        }
        //5.生成最终数据 姓名（唯一）-性别-年龄
        ArrayList<String> list=getInfo(famiylNameList,boyNameList,girlNameList,120,120);
        Collections.shuffle(list);
        //6.写出数据到本地文件
        BufferedWriter bw=new BufferedWriter(new FileWriter("names.txt"));
        for (String str : list) {
            bw.write(str);
            bw.newLine();
        }
        bw.close();
    }
    /*
    作用：获取男生 女生的信息
    参数一：姓氏集合
    参数二：男生名字集合
    参数三：女生名字集合
    参数四：个数 你需要几个男生？
    参数五：女生个数
     */
    public static ArrayList<String> getInfo(ArrayList<String> famiylNameList,ArrayList<String> boyNameList
    ,ArrayList<String> girlNameList,int boyCount,int girlCount){
        //1.生成男生不重复的名字
        HashSet<String> boyhs=new HashSet<>();
        //在姓和名这两个集合中随机抽取 组成的名字放进set
        while(true){
            if(boyhs.size()==boyCount){
                break;
            }
            //随机
            Collections.shuffle(famiylNameList);
            Collections.shuffle(boyNameList);

            boyhs.add(famiylNameList.get((0))+boyNameList.get(0));
        }
        //2.生成女生不重复名字
        HashSet<String> girlhs=new HashSet<>();
        //在姓和名这两个集合中随机抽取 组成的名字放进set
        while(true){
            if(girlhs.size()==girlCount){
                break;
            }
            //随机
            Collections.shuffle(famiylNameList);
            Collections.shuffle(girlNameList);

            girlhs.add(famiylNameList.get((0))+girlNameList.get(0));
        }
        //3.张三-男-20
        ArrayList<String> list=new ArrayList<>();
        //随机一个年龄
        Random r=new Random();
        for (String boyName : boyhs) {
            int age = r.nextInt(10) + 18;//18-27
            list.add(boyName+"-男-"+age);
        }
        //4.生成女生信息 并添加到list
        for (String girlName : girlhs) {
            int age = r.nextInt(10) + 18;//18-27
            list.add(girlName+"-女-"+age);
        }
        return list;
    }

    /*
    作用：根据正则表达式获取字符串中的数据
    参数一：完整的字符串
    参数二：正则表达式
    参数三：获取正则表达式中的第几组 1：就是所有的字 2：句号逗号
    返回值：我们真正想要的数据
     */
    private static ArrayList<String> getData(String str,String regex,int index) {
        //1.创建集合存放数据
        ArrayList<String> list=new ArrayList<>();
        //2.按正则表达式的规则获取网页中的数据
        //获取正则表达式的对象
        Pattern pattern = Pattern.compile(regex);
        //按照pattern的规则到str中获取数据
        Matcher match= pattern.matcher(str);
        while(match.find()){
            list.add(match.group(index));
        }
        return list;
    }

    /*
    作用：从网络上爬取数据，把数据拼接成字符串返回
    参数：网址
    返回值：爬取到的所有数据
     */
    public static String webCrawler(String net) throws IOException {
        //1.定义sb容器 来拼接爬取到的数据
        StringBuilder sb=new StringBuilder();
        //2.创建一个网址URL对象
        URL url=new URL(net);
        //3.连接上这个网址
        //细节：保证网路畅通，而且这个网址是可以打开的
        URLConnection conn = url.openConnection();

        // 关键：添加模拟浏览器的请求头
        conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
        // 可选：添加其他请求头，进一步伪装
        conn.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        conn.setRequestProperty("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8");
        conn.setRequestProperty("Referer", "https://www.meimeiming.com/"); // 来源页

        conn.setConnectTimeout(5000); // 连接超时
        conn.setReadTimeout(5000);    // 读取超时

        //4.读取网址上的数据 网址上有中文 所以要用转换流 把字节流转换成字符流
        //注意：网址对象不能获得FileReader 所以只能通过转换流操作
        InputStreamReader isr=new InputStreamReader(conn.getInputStream());
        int ch;
        while((ch=isr.read())!=-1){
            sb.append((char)ch);
        }
        //5.关闭
        isr.close();
        //6.把读取到的数据返回
        return sb.toString();
    }
}
