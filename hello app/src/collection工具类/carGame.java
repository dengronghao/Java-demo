package collection¹¤¾ßÀà;

import java.util.ArrayList;
import java.util.List;

public class carGame {

        public static List allCars=new ArrayList<>();

        static {
            String[] sizes={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
            String[] colors={"ºìÌÒ","ºÚÌÒ","ºì×©","ºÚ×©"};

            for (int i = 0; i < colors.length; i++) {
                for (int j = 0; j < sizes.length; j++) {
                    cars a=new cars(sizes[i],colors[i]);
                    allCars.add(a);
                }
            }

            allCars.add(new cars("king1",""));
            allCars.add(new cars("king2",""));
        }

    public static void main(String[] args) {
        System.out.println(allCars);
    }

}


