package usingStatic;

import java.util.ArrayList;

public class static_cargame {


        public static ArrayList<String> cars=new ArrayList<>();//54张牌加载

        static{
            String[] point={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
            String[] type={"红桃","黑桃","方块","梅花"};
            for (int i = 0; i < 13; i++) {
                for (int j = 0; j < 4; j++) {
                    String car=point[i]+type[j];
                    cars.add(car);
                }
            }
        }

    public static void main(String[] args) {
        System.out.println(cars);
    }


}
