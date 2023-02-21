package Map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        Map<apple,Integer> apple=new TreeMap<>(new Comparator<apple>() {
            @Override
            public int compare(apple o1, apple o2) {
                return o1.getKilo()-o2.getKilo();
            }
        });


        apple.put(new apple(10,"山东"),20);
        apple.put(new apple(15,"山东"),20);
        apple.put(new apple(16,"山东"),20);

        System.out.println(apple);

    }


}
