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
        //增加；
        list.add("david");
        list.add("manU");
        list.add("ronaldo");
        list.add("gigs");
        list.add("rooney");

        //是否为空
        list.isEmpty();

        //大小
        list.size();

        //清空
        //list.clear();

        //是否包含每个元素
        list.contains("david");

        //删除某个元素,最早出现的一个
        list.remove("manU");

        //集合转化为数组；
        Object[] STRINGS = list.toArray();

        //collection迭代器（专用于集合的遍历）
        Iterator<String> i = list.iterator();
        i.next();//下一个元素；
        i.hasNext();//是否有下一个元素；
        while (i.hasNext()) {
            String NEXT = i.next();
            System.out.println(NEXT);
        }
        //lambda简化迭代器
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println(".........................................................");
        //list.forEach(System.out::println);//为上面的简化


        //for循环，快捷键list.for;数组也能用；
        for (String s : list) {
            System.out.println(s);
        }


        Collection<movies> m = new ArrayList<>();
    }
}
