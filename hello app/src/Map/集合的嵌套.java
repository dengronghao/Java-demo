package Map;

import java.util.*;

public class ���ϵ�Ƕ�� {
    public static void main(String[] args) {
        //ѧ��ͶƱ
        Map<String, List<String>> votes=new HashMap<>();

        List<String> student1=new ArrayList<>();
        Collections.addAll(student1,"a","b","v");
        votes.put("david",student1);


        List<String> student2=new ArrayList<>();
        Collections.addAll(student2,"a","b","c");
        votes.put("ronaldo",student2);

        Map<String, Integer> all=new HashMap<>();

        Collection<List<String>> infos=votes.values();

        for (List<String> info : infos) {//��һ�α����õ����Ǽ���
            for (String s : info) {//�ڶ��α����õ�����String��
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
