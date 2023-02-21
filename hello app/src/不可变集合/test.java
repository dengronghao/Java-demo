package 不可变集合;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        List<Double> goal=List.of(300.20,100.35,45.23);//不可变集合

        Set<String> names=Set.of("carlos","disco","ronaldo");
/*        names.add("123");*/
        Set<Integer> numbers=Set.of(10,9,8,8);

        Map<String,Integer> phones = Map.of("huawei",1999,"apple",6799);

        System.out.println(names);
        System.out.println(numbers);

    }
}
