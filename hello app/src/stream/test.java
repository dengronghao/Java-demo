package stream;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        List<String> names= new ArrayList<>();
        Collections.addAll(names,"�Ŵ��","huawei","dick");
        names.forEach(s -> System.out.println());


        names.stream().filter(s->s.startsWith("��")).forEach(s -> System.out.println(s));


        ///stream�Ļ�ȡ
        Collection list = new ArrayList();
        Stream<String> s = list.stream();

        //map��stream��ȡ
        Map<String,Integer> votes = new HashMap<>();
        Stream<String> keys=votes.keySet().stream();//�ü�
        Stream<Integer> values=votes.values().stream();//��ֵ
        Stream<Map.Entry<String,Integer>> keyValues = votes.entrySet().stream();//������

        //�����stream��ȡ
        String[] names1={"����","����","����","����"};
        Stream<String> namesStream = Arrays.stream(names1);
        Stream<String> namesStream1 = Stream.of(names1);

        //stream����api
        names.stream().filter(s1 -> s1.startsWith("��")).forEach(System.out::println);

        //map�ӹ�����
        names.stream().map(s1 -> "����ģ�" + s1).forEach(System.out::println);

        //�����е����Ƽӹ�Ϊһ������
         names.stream().map(s1 -> new name(s1)).forEach(System.out::println);
         names.stream().map(name::new).forEach(System.out::println);


         //�ϲ���
        Stream<String> s1 = Stream.of(names1);
        Stream<String> a2 = Stream.of("name","big","apple");
        Stream<String> s3 =Stream.concat(s1,a2);


        //�ռ�stream��      ***��ֻ��ʹ��һ��
        //List<String> l1=s1.collect(Collectors.toList());
        List<String> l1=s1.toList();

    }



}
