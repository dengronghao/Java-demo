package Array;

import java.util.Arrays;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {

        int[] a={0,1,2,3,5,45,6,9,7};
        //输出数组内容；
        String out= Arrays.toString(a);
        System.out.println(out);

        //排序
        Arrays.sort(a);//默认升序
        System.out.println(Arrays.toString(a));


        Integer[]  b={5,6,89,9,56,78};
        Arrays.sort(b, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;//降序
            }
        });

        System.out.println(Arrays.toString(b));


        //二分查找，先排序；
        int result=Arrays.binarySearch(a,9);
        //返回正数：位置；返回负数，应该插入的位置；
        System.out.println(result);

        //自定义排序规则

    }


}
