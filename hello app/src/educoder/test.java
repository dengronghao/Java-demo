package educoder;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�����һ����Ȼ��N��");
        int N = sc.nextInt();//��ȡ���������N
        int sum = 1;
        /*****start*****/
        for (int i = 1; i <= N; i++) {
            sum = sum *i;
        }







        /*****end*****/

        System.out.println("��Ȼ��N�Ľ׳�Ϊ" + sum);
    }

}






