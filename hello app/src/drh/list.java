package drh;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        list.add("adv");
        list.add(1,"efj");

        String delete=list.remove(1);//删除第i个元素
        list.remove("efj");

        String set=list.set(0,"bk7");//set为删除元素；


        ArrayList<Integer> scores=new ArrayList<>();
        scores.add(34);
        scores.add(74);
        scores.add(94);
        scores.add(64);
        scores.add(74);
        scores.add(84);

        for(int i=scores.size()-1;i>=0;i--)//从后往前删最好；
        {
            if(scores.get(i)<60)
            {
                scores.remove(i);
            }
        }
        System.out.println(scores);

        football db7=new football(7,"david beckham","mid");
        football cr7=new football(7,"cristiano ronaldo","striker");
        football sr4=new football(4,"sergio ramous","defender");
        ArrayList<football> player=new ArrayList<>();
        player.add(db7);
        player.add(cr7);
        player.add(sr4);

        for(int i=0;i<player.size();i++)
        {
            football p=player.get(i);
            System.out.println("name:"+p.getClub());
            System.out.println("number"+p.getNumber());
            System.out.println("position"+p.getPosition());
        }

        System.out.println("输出完成");
    }
}
