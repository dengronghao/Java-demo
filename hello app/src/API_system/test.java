package API_system;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        long time= System.currentTimeMillis();
        System.out.println(time);

        int[] arr={10,20,30,40,50,60};
        int[] arr1=new int[6];
        System.arraycopy(arr1,3,arr,2,3);
        System.out.println(Arrays.toString(arr));

    }

}

