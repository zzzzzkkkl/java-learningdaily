package exception;

public class ThrowDemo {
    public static void main(String[] args) {
        //抛出异常

        int[] arr={2,4,52,2};
        //根据索引找对应的元素
        int index=4;
        int element=getElement(arr,index);

        System.out.println(element);
        System.out.println("over");
    }
    public static int getElement(int[] arr,int index){
        //判断 索引是否越界
        if(index<0||index>arr.length-1){
            /*
            条件满足，执行完throw抛出异常对象后，方法已经无法继续运算
            这是就会结束当前方法执行，并将异常告知给调用者，这时就需要通过异常来解决
             */
            throw new ArrayIndexOutOfBoundsException("越界");
        }
        int element=arr[index];
        return element;
    }
}
