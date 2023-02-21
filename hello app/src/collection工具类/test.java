package collection工具类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class test {
    public static void main(String[] args) {
        //连续的add;
        List<String> ARRAY=new ArrayList();
        Collections.addAll(ARRAY,"fd","ff","fds","fd");

        Collections.shuffle(ARRAY);//打乱集合顺序；
        System.out.println(ARRAY);

        List<Integer> lists=new ArrayList();
        Collections.addAll(lists,2,3,4,5,6,7);

        Collections.shuffle(lists);
        System.out.println(lists);
        Collections.sort(lists);//排序

        List<student> students=new ArrayList();
        Collections.addAll(students,new student(2),new student(5),new student(6));
        Collections.sort(students, new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                return o1.getGoal()- o2.getGoal();
            }
        });






    }
}
