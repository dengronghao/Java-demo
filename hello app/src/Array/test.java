package Array;

import java.util.Arrays;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {

        int[] a={0,1,2,3,5,45,6,9,7};
        //����������ݣ�
        String out= Arrays.toString(a);
        System.out.println(out);

        //����
        Arrays.sort(a);//Ĭ������
        System.out.println(Arrays.toString(a));


        Integer[]  b={5,6,89,9,56,78};
        Arrays.sort(b, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;//����
            }
        });

        System.out.println(Arrays.toString(b));


        //���ֲ��ң�������
        int result=Arrays.binarySearch(a,9);
        //����������λ�ã����ظ�����Ӧ�ò����λ�ã�
        System.out.println(result);

        //�Զ����������

    }


}
