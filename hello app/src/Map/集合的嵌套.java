package Map;

import java.util.*;

public class 集合的嵌套 {
    public static void main(String[] args) {
        //学生投票
        Map<String, List<String>> votes=new HashMap<>();

        List<String> student1=new ArrayList<>();
        Collections.addAll(student1,"a","b","v");
        votes.put("david",student1);


        List<String> student2=new ArrayList<>();
        Collections.addAll(student2,"a","b","c");
        votes.put("ronaldo",student2);

        Map<String, Integer> all=new HashMap<>();

        Collection<List<String>> infos=votes.values();

        for (List<String> info : infos) {//第一次便利得到的是集合
            for (String s : info) {//第二次便利得到的是String；
                if(votes.containsKey(s)){
                    all.put(s,all.get(s)+1);
                }else{
                    all.put(s,1);
                }
            }
        }

        System.out.println(all);

    }
}
