package arraysdemo;

import java.util.Arrays;
import java.util.Comparator;

public class MyArraysDemo1 {
    public static void main(String[] args) {
        /*sort 按照指定规则排序
        参数一：要排序的数组
        参数二：排序的规则
        细节：只能给引用数据类型的数组进行排序
        如果数组是基本数据类型，需要变成其对应的包装类 eg.int变成Integer
         */

        Integer[] arr={2,3,1,5,6,7,8,4,9};
        //第二个参数是一个接口，所以我们调用方法时，需要传递这个接口的实现类对象，作为排序的规则
        //但这个实现类对象，只使用一次，没必要单独写一个类，直接采用匿名内部类的方式

        //sort底层原理.
        //插入排序+二分查找进行排序:
        //默认把0索引的数据当作时有序的序列，1索引到最后认为是无序的序列,
        //遍历无序序列得到里面的每一个元素，假设当前遍历得到的元素是A,
        //把A向有序序列中插入，插入时利用二分查找确定A元素的插入点,
        //拿着A元素，跟插入点的元素进行比较，比较的规则就是Compare方法的方法体,
        //如果方法的返回值是负数，A继续和前面的数据进行比较
        //如果方法的返回值是正数，A继续和后面的数据进行比较
        //如果方法返回0，A继续和后面的数据进行比较
        //直到能确定A的最终位置为止

        //简单理解：
        //o1-o2：升序
        //o2-o1:降序

        //compare方法的参数
        //参数一：表示无序序列中，遍历得到的每一个元素
        //参数二：有序序列中的元素
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
    }
}
