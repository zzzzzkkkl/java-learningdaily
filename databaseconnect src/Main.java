import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO(); // 创建数据访问对象

        // 1. 查询所有学生（初始数据）
        System.out.println("===== 初始学生数据 =====");
        queryAndPrint(dao); // 调用封装的查询打印方法

        // 2. 新增学生
        System.out.println("\n===== 新增学生 =====");
        Student newStudent = new Student(); // 创建新学生对象
        newStudent.setSno("2025001"); // 设置学号
        newStudent.setSanme("赵六"); // 设置姓名
        newStudent.setSage(20); // 设置年龄
        newStudent.setSdept("物联网工程"); // 设置系部
        int insertRows = dao.insert(newStudent); // 调用新增方法
        System.out.println("新增了" + insertRows + "条记录");
        System.out.println("===== 新增后学生数据 =====");
        queryAndPrint(dao); // 打印新增后的结果

        // 3. 修改学生（修改刚新增的学生）
        System.out.println("\n===== 修改学生 =====");
        Student updateStudent = new Student();
        updateStudent.setSno("2025001"); // 要修改的学生学号
        updateStudent.setSanme("赵六修改后"); // 新姓名
        updateStudent.setSage(21); // 新年龄
        updateStudent.setSdept("智能物联网"); // 新系部
        int updateRows = dao.update(updateStudent); // 调用修改方法
        System.out.println("修改了" + updateRows + "条记录");
        System.out.println("===== 修改后学生数据 =====");
        queryAndPrint(dao);

        // 4. 删除学生（删除刚新增的学生）
        System.out.println("\n===== 删除学生 =====");
        int deleteRows = dao.delete("2025001"); // 传入要删除的学号
        System.out.println("删除了" + deleteRows + "条记录");
        System.out.println("===== 删除后学生数据 =====");
        queryAndPrint(dao);
    }

    // 封装查询并打印的方法（避免重复代码）
    private static void queryAndPrint(StudentDAO dao) {
        List<Student> students = dao.queryAll(); // 调用查询方法
        // 遍历学生列表并打印
        for (Student s : students) {
            System.out.println(s.getSno() + " | " + s.getSanme() + " | " + s.getSage() + " | " + s.getSdept());
        }
    }
}