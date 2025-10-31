import java.sql.*;
public class DBUtil {
    //数据库连接地址：URL
    //jdbc:sqlserver://localhost: 1433:连接本地sql，端口：1433
    //databaseName=student 数据库名称：student
    //intergratedSecurity=true windows验证，无需输入帐号密码
    //teueServerCertificate=true信任服务器证书 避免SSL证书错误
    private static final String URL="jdbc:sqlserver://localhost: 1433;databaseName=student;intergratedSecurity=true;teueServerCertificate=true;";

    //获取数据库连接
    public static Connection getConnection(){//Connection是一个接口
        Connection conn=null;//连接对象
        try{
            //加载sql的驱动
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //通过驱动管理器获取连接
            conn=DriverManager.getConnection(URL);
            System.out.println("数据库连接成功！");
        }catch (ClassNotFoundException e){//catch块用来捕获异常
            e.printStackTrace();//打印输出异常问题
            System.out.println("jdbc驱动加载失败");//类未找到，驱动jar包未正确导入时报错
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("数据库连接失败!");//地址或端口错误，数据库不存在等
        }
        return conn;//返回连接对象
    }

    //关闭资源（ResultSet结果集，Statement语句（执行sql语句），Connection连接
    public static void close(ResultSet rs,Statement stmt,Connection conn){
        try{
            //关闭顺序：先关结果集，再关语句，最后关连接。就像用完东西要收好，避免资源泄漏
            if(rs!=null) rs.close();//结果集不为空才关闭
            if(stmt!=null) stmt.close();//语句对象不为空时才关闭
            if(conn!=null) conn.close();//连接不为空才关闭
            System.out.println("资源关闭成功！");
        }catch(SQLException e){
            e.printStackTrace();//关闭失败打印异常
        }
    }
}