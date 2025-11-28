package homework.day06;

public class question6 {
    public static void main(String[] args) {
        /*定义一个方法，判断两个数组是否相等
        长度和内容都相等才算相等
         */
        int arr1[]={1,5};
        int arr2[]={1,2,3,4,5};
        equals(arr1,arr2);
    }
    public static void equals(int arr1[],int arr2[]){
        if(arr1.length==arr2.length){
            for(int i=0;i<arr1.length;i++){
                for (int j = 0; j < arr2.length; j++) {
                    if(arr1[i]==arr2[j]){
                        System.out.println("相等");
                    }
                }
            }
        }else{
            System.out.println("不相等");
        }
    }
}
