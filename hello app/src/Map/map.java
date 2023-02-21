package Map;

import java.util.*;

public class map {
    public static void main(String[] args) {
        Map<String,Integer> maps=new HashMap<>();
        maps.put("小明",12);
        maps.put("小红",12);
        maps.put("小梁",12);
        maps.put("小绿",12);
        maps.put("小绿",20);//将前面的12覆盖
        //左为键（key），右为值（value）；
        //hashMap :键：无序，不重复，无索引；值可以重复；

        //添加
        maps.put("小兰",18);

        //删除
        maps.remove("小明",12);



        //判断集合中是否包含某个键；
        maps.containsKey("小兰");

        //判断集合中是否包含某个值
        maps.containsValue(13);

        //全部删除
        /*maps.clear();*/

        //获取全部键的集合,和值；
        Set<String> set= maps.keySet();
        Collection<Integer> set1=  maps.values();

        //合并map
        Map<String,Integer> names =new HashMap<>();
        names.put("小手段",12);
        names.put("小大撒",12);

        maps.putAll(names);
        
        
        ///map的遍历
        Set<Map.Entry<String,Integer>> entries=maps.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key=entry.getKey();
            int value=entry.getValue();
            System.out.println(key+"=====>"+value);
        }

        Set<String> ks=maps.keySet();
        for (String k : ks) {
            int value=maps.get(ks);
            System.out.println(ks+"=====>"+value);
        }

        ////lambda遍历
        maps.forEach((k,v)->{
            System.out.println(k+"=====>"+v);
        });

    }
}

