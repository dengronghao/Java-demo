package set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//���ظ���������������
//�����
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
        });//���ֱȽϹ���һ���Ǽ��ϵģ�һ�������ж���ģ����ֶ��У�����ʹ�ü��ϵģ�

        set1.add(new student("asd","��",24));
        set1.add(new student("af","��",5));
        set1.add(new student("afd","Ů",10));
        System.out.println(set1);

    }


}
