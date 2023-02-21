package set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//不重复，可排序，无索引
//红黑树
public class treeSet {
    public static void main(String[] args) {
        Set<String> set=new TreeSet<>();
        set.add("FGS");
        set.add("a");
        set.add("g");
        System.out.println(set);


        Set<student> set1=new TreeSet<>(new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                return o1.getAge()- o2.getAge();
            }
        });//两种比较规则，一种是集合的，一种是类中定义的；两种都有，优先使用集合的；

        set1.add(new student("asd","男",24));
        set1.add(new student("af","男",5));
        set1.add(new student("afd","女",10));
        System.out.println(set1);

    }


}
