package 泛型的使用;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<dog> dogs=new ArrayList<>();
        dogs.add(new dog());
        dogs.add(new dog());

        ArrayList<cars> car=new ArrayList<>();
        car.add(new benz());
        car.add(new gtr());

    }

    public static  void car_race(ArrayList<? extends cars> car){//只允许cars的子类进入；还可以用super

    }

}

