import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    // 1. 查询所有学生
    public List<Student> queryAll() {
        List<Student> studentList = new ArrayList<>();
        Connection conn = DBUtil.getConnection();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conn.createStatement();
            String sql = "SELECT sno, sanme, sage, sdept FROM dbo.Student";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Student student = new Student();
                student.setSno(rs.getString("sno"));
                student.setSanme(rs.getString("sanme"));
                student.setSage(rs.getInt("sage"));
                student.setSdept(rs.getString("sdept"));
                studentList.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(rs, stmt, conn);
        }
        return studentList;
    }

    // 2. 新增学生
    public int insert(Student student) {
        Connection conn = DBUtil.getConnection();
        PreparedStatement pstmt = null;
        int rows = 0;
        try {
            String sql = "INSERT INTO dbo.Student (sno, sanme, sage, sdept) VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, student.getSno());
            pstmt.setString(2, student.getSanme());
            pstmt.setInt(3, student.getSage());
            pstmt.setString(4, student.getSdept());
            rows = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(null, pstmt, conn);
        }
        return rows;
    }

    // 3. 修改学生
    public int update(Student student) {
        Connection conn = DBUtil.getConnection();
        PreparedStatement pstmt = null;
        int rows = 0;
        try {
            String sql = "UPDATE dbo.Student SET sanme = ?, sage = ?, sdept = ? WHERE sno = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, student.getSanme());
            pstmt.setInt(2, student.getSage());
            pstmt.setString(3, student.getSdept());
            pstmt.setString(4, student.getSno());
            rows = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(null, pstmt, conn);
        }
        return rows;
    }

    // 4. 删除学生
    public int delete(String sno) {
        Connection conn = DBUtil.getConnection();
        PreparedStatement pstmt = null;
        int rows = 0;
        try {
            String sql = "DELETE FROM dbo.Student WHERE sno = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, sno);
            rows = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(null, pstmt, conn);
        }
        return rows;
    }
}