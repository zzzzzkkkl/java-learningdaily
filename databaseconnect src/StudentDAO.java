import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class StudentDAO {
    //1.查询学生
    public List<Student> queryAll(){
        List<Student> studentList=new ArrayList<>();//存储结果的集合，我们之后处理用这个 正式
        Connection conn=DBUtil.getConnection();//获取数据库连接
        Statement stmt=null;//语句对象，执行静态sql
        ResultSet rs=null;//结果集，存放查询返回的数据。从数据库里拿来的临时

        try{
            stmt=conn.createStatement();//创建语句对象，连接，创建语句
            //sql查询语句
            String sql="SELECT sno, sanme, sage, sdept FROM dbo.Student";
            rs=stmt.executeQuery(sql);//执行查询，返回结果集。写好的sql这个内容放到stmt里执行

            //遍历结果集，将结果封装成Student对象
            while(rs.next()){//rs.next() 移动到下一条记录，有数据返回true
                Student student=new Student();
                //从ResultSet结果集中获取字段名，将字段名设置给Student对象
                student.setSno(rs.getString("sno"));
                student.setSanme(rs.getString("sanme"));
                student.setSage(rs.getInt("sage"));
                student.setSdept(rs.getString("sdept"));

                //将对象放到集合里
                studentList.add(student);
            }
        }catch(SQLException e){
            e.printStackTrace();//查询失败时异常
        }finally{
            DBUtil.close(rs,stmt,conn);//无论是否发生异常，都要关闭资源
        }
        return studentList;//返回查询结果
    }
    //2.新增学生
    public int insert(Student student){
        Connection conn=DBUtil.getConnection();
        PreparedStatement pstmt=null;//预编译语句对象，防止sql注入，更安全
        int rows=0;//受影响的行数，新增成功返回1，失败返回0

        try{
            // SQL插入语句：使用?作为占位符，后续设置参数
            String sql = "INSERT INTO dbo.Student (sno, sanme, sage, sdept) VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql); // 创建预编译语句

            //为占位符设置value，索引从1开始
            pstmt.setString(1,student.getSno());
            pstmt.setString(2,student.getSanme());
            pstmt.setInt(3,student.getSage());
            pstmt.setString(4,student.getSdept());

            rows=pstmt.executeUpdate();//更新数据库里的数据
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            DBUtil.close(null,pstmt,conn);
        }
        return rows;
    }
    //3.修改学生
    public int update(Student student){
        Connection conn=DBUtil.getConnection();
        PreparedStatement pstmt=null;
        int rows=0;

        try{
            // SQL更新语句：根据sno（学号）更新其他字段
            String sql = "UPDATE dbo.Student SET sanme = ?, sage = ?, sdept = ? WHERE sno = ?";
            pstmt = conn.prepareStatement(sql);

            //设置value
            pstmt.setString(1,student.getSno());
            pstmt.setString(2,student.getSanme());
            pstmt.setInt(3,student.getSage());
            pstmt.setString(4,student.getSdept());

            rows=pstmt.executeUpdate();//更新
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            DBUtil.close(null,pstmt,conn);
        }
        return rows;
    }
    //4.删除学生
    public int delete(String sno){
        Connection conn=DBUtil.getConnection();
        PreparedStatement pstmt=null;
        int rows=0;

        try{
            // SQL删除语句：根据sno删除记录
            String sql = "DELETE FROM dbo.Student WHERE sno = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, sno); // 设置学号参数

            rows=pstmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            DBUtil.close(null,pstmt,conn);
        }
        return rows;
    }
}
