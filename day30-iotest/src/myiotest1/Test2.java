package myiotest1;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.http.HttpUtil;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        //利用hutool生成假数据，并写到文件中

        //1.定义网址
        String familyNameNet="https://baijiaxing.hao86.com/";
        String boyNameNet="https://www.meimeiming.com/zhouyi/5143.html";
        String girlNameNet="https://xuminhao.com/mz/20751.html";

        //2.爬取数据
        String familyNameStr = HttpUtil.get(familyNameNet);
        String boyNameStr = HttpUtil.get(boyNameNet);
        String girlNameStr = HttpUtil.get(girlNameNet);

        //3.利用正则表达式获取数据
        List<String> familyNameTempList = ReUtil.findAll("(.{4})(，|。)", familyNameStr, 1);
        System.out.println(familyNameTempList);

        //4.写出数据到文件
        //细节：糊涂包的相对路径，不是相对于当前项目而言，而是相对于class文件而言的
        //FileUtil.writeLines(list,"names.txt","UTF-8");
    }
}
