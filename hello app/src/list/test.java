package list;

import drh.list;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();//多态
        ArrayList<String> LIST=new ArrayList<>();//

        //添加元素
        list.add("皇家马德里");

        //在某一位置加入元素；
        list.add(0,"LaLiGa");

        //去除某一位置的元素
        list.get(0);

        //修改某一位置的元素
        list.set(0,"united");

    }


}
