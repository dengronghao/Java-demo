package stream;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        List<String> names= new ArrayList<>();
        Collections.addAll(names,"张大大","huawei","dick");
        names.forEach(s -> System.out.println());


        names.stream().filter(s->s.startsWith("张")).forEach(s -> System.out.println(s));


        ///stream的获取
        Collection list = new ArrayList();
        Stream<String> s = list.stream();

        //map的stream获取
        Map<String,Integer> votes = new HashMap<>();
        Stream<String> keys=votes.keySet().stream();//拿键
        Stream<Integer> values=votes.values().stream();//拿值
        Stream<Map.Entry<String,Integer>> keyValues = votes.entrySet().stream();//拿整体

        //数组的stream获取
        String[] names1={"南宁","桂林","贺州","北京"};
        Stream<String> namesStream = Arrays.stream(names1);
        Stream<String> namesStream1 = Stream.of(names1);

        //stream常用api
        names.stream().filter(s1 -> s1.startsWith("张")).forEach(System.out::println);

        //map加工方法
        names.stream().map(s1 -> "优秀的：" + s1).forEach(System.out::println);

        //把所有的名称加工为一个对象
         names.stream().map(s1 -> new name(s1)).forEach(System.out::println);
         names.stream().map(name::new).forEach(System.out::println);


         //合并流
        Stream<String> s1 = Stream.of(names1);
        Stream<String> a2 = Stream.of("name","big","apple");
        Stream<String> s3 =Stream.concat(s1,a2);


        //收集stream流      ***流只能使用一次
        //List<String> l1=s1.collect(Collectors.toList());
        List<String> l1=s1.toList();

    }



}
