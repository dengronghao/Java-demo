package collection;

import drh.list;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class test {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        //���ӣ�
        list.add("david");
        list.add("manU");
        list.add("ronaldo");
        list.add("gigs");
        list.add("rooney");

        //�Ƿ�Ϊ��
        list.isEmpty();

        //��С
        list.size();

        //���
        //list.clear();

        //�Ƿ����ÿ��Ԫ��
        list.contains("david");

        //ɾ��ĳ��Ԫ��,������ֵ�һ��
        list.remove("manU");

        //����ת��Ϊ���飻
        Object[] STRINGS = list.toArray();

        //collection��������ר���ڼ��ϵı�����
        Iterator<String> i = list.iterator();
        i.next();//��һ��Ԫ�أ�
        i.hasNext();//�Ƿ�����һ��Ԫ�أ�
        while (i.hasNext()) {
            String NEXT = i.next();
            System.out.println(NEXT);
        }
        //lambda�򻯵�����
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println(".........................................................");
        //list.forEach(System.out::println);//Ϊ����ļ�


        //forѭ������ݼ�list.for;����Ҳ���ã�
        for (String s : list) {
            System.out.println(s);
        }


        Collection<movies> m = new ArrayList<>();
    }
}
