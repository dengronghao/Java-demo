package Map;

import java.util.*;

public class map {
    public static void main(String[] args) {
        Map<String,Integer> maps=new HashMap<>();
        maps.put("С��",12);
        maps.put("С��",12);
        maps.put("С��",12);
        maps.put("С��",12);
        maps.put("С��",20);//��ǰ���12����
        //��Ϊ����key������Ϊֵ��value����
        //hashMap :�������򣬲��ظ�����������ֵ�����ظ���

        //���
        maps.put("С��",18);

        //ɾ��
        maps.remove("С��",12);



        //�жϼ������Ƿ����ĳ������
        maps.containsKey("С��");

        //�жϼ������Ƿ����ĳ��ֵ
        maps.containsValue(13);

        //ȫ��ɾ��
        /*maps.clear();*/

        //��ȡȫ�����ļ���,��ֵ��
        Set<String> set= maps.keySet();
        Collection<Integer> set1=  maps.values();

        //�ϲ�map
        Map<String,Integer> names =new HashMap<>();
        names.put("С�ֶ�",12);
        names.put("С����",12);

        maps.putAll(names);
        
        
        ///map�ı���
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

        ////lambda����
        maps.forEach((k,v)->{
            System.out.println(k+"=====>"+v);
        });

    }
}

