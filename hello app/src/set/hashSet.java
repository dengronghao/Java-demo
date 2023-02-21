package set;

import java.util.HashSet;
import java.util.Set;

public class hashSet {
    public static void main(String[] args) {
        Set<String> sets=new HashSet<>();//有序，不重复，无索引；
        sets.add("david");
        sets.add("java");
        sets.add("manUnited");
        //哈希表，哈希值：类似于地址
        //原理：数组+链表+哈希算法（1.7）
        //数组，链表，红黑树；（1.8）

        Set<student> students=new HashSet<>();
        students.add(new student("david","男",34));
        students.add(new student("ronaldo","男",37));


        System.out.println(students);
    }
}
