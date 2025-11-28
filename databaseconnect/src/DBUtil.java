import java.sql.*;

public class DBUtil {
    // 数据库连接信息（Windows身份验证）
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=student;integratedSecurity=true;trustServerCertificate=true;";

    // 1. 获取数据库连接
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(URL);
            System.out.println("数据库连接成功！");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("JDBC驱动加载失败！");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("数据库连接失败！");
        }
        return conn;
    }

    // 2. 关闭资源（ResultSet、Statement、Connection）
    public static void close(ResultSet rs, Statement stmt, Connection conn) {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
            System.out.println("资源关闭成功！");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
