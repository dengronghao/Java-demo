package set;

import java.util.HashSet;
import java.util.Set;

public class hashSet {
    public static void main(String[] args) {
        Set<String> sets=new HashSet<>();//���򣬲��ظ�����������
        sets.add("david");
        sets.add("java");
        sets.add("manUnited");
        //��ϣ����ϣֵ�������ڵ�ַ
        //ԭ������+����+��ϣ�㷨��1.7��
        //���飬�������������1.8��

        Set<student> students=new HashSet<>();
        students.add(new student("david","��",34));
        students.add(new student("ronaldo","��",37));


        System.out.println(students);
    }
}
