package com.itheima.test8;

public class Test {
    public static void main(String[] args) {
        /*定义一个长度为3的数组，数组存储1-3名学生对象作为初始数据，学生对象的学号、姓名各不相同
        学生的属性：学号、姓名、年龄。
        要求1：再次添加一个学生对象，并在添加的时候进行学号唯一的判断
        要求2：添加完毕后，遍历所有学生的信息
        要求3：通过id删除学生信息。若存在，就删除；若不存在，提示删除失败
        要求4：删除完毕后，遍历所有学生信息
        要求5：查询数组id为“2”的学生，若存在，就将它的年龄+1岁
         */
        //创建数组
        Student []arr=new Student[3];
        //创建学生对象并添加到数组
        Student stu1=new Student(1,"张三",23);
        Student stu2=new Student(2,"李四",24);
        Student stu3=new Student(3,"王五",25);
        //将学生对象添加到数组中
        arr[0]=stu1;
        arr[1]=stu2;
        arr[2]=stu3;
        /*//要求1
        Student stu4=new Student(4,"赵六",26);
        //将stu4添加进去：1）进行学号唯一性判断
        boolean flag=contains(arr,stu4.getId());
        if(flag){
            System.out.println("当前id重复，请修改id后再进行添加");
        }else{
            //2）学号唯一，再判断数组是否存满；若存满，只能创建新数,新数组的长度=老数组+1；若没有存满，直接添加
            int count=getCount(arr);
            if(count==arr.length){
                //存满。创建新数组，长度=老数组的长度+1，然后将老数组中的元素拷贝到新数组
                Student[] newArr=creatNewArr(arr);
                newArr[count]=stu4;
                printArr(newArr);
            }else{
                //未存满。[stu1,stu2,null]getCount获得的是2，表示数组中有2个元素
                // 也表示下次再添加数据，也是添加到2索引的位置
                arr[count]=stu4;
                //要求2
                printArr(arr);
            }
        }
        //要求3
        int index=getIndex(arr,2);
        System.out.println(index);
        if(index>=0){
            //存在，直接删除
            arr[index]=null;
            //要求4
            printArr(arr);
        }else{
            //不存在
            System.out.println("删除失败");
        }*/
        //要求5
        int index=getIndex(arr,4);
        if(index>=0){
            //存在
            Student stu=arr[index];
            int newAge=stu.getAge()+1;
            //把加一后的年龄在放回
            stu.setAge(newAge);
            printArr(arr);
        }else{
            //不存在
            System.out.println("当前id不存在，无法修改");
        }
    }

    //要求3-找到id在数组中对应的索引
    public static int getIndex(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu=arr[i];
            if(stu!=null){
                int sid=stu.getId();
                if(sid==id){
                    return i;
                }
            }
        }
        //当循环结束后还没有找到相等的sid，表示不存在
        return -1;
    }
    //要求2-添加完毕后，遍历所有学生信息
    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            Student stu=arr[i];
            if(stu!=null){
                System.out.println(stu.getId()+","+stu.getName()+","+stu.getAge());
            }
        }
    }
    //要求1-存满后创建新数组
    public static Student[] creatNewArr(Student[] arr){
        Student[] newArr=new Student[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
        }
        return newArr;
    }
    //要求1-判断数组中存了几个数，是否满
    public static int getCount(Student[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                count++;
            }
        }
        return count;
    }
    //要求1-判断唯一性
    public static boolean contains(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu=arr[i];
            int sid=stu.getId();
            if(id==sid){
                return true;
            }
        }
        return false;
    }
}
