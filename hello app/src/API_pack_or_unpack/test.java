package API_pack_or_unpack;

public class test {
    public static void main(String[] args) {
        int a = 10;
        Integer a1 = 11;
        Integer a2 = a;//װ��
        System.out.println(a2);

        Double b=10.568;
        double b1=5.36;
        double b2=b;//�����
        System.out.println(b2);

        //Integer,DoubleΪ�ࣻ
        //int.double�������ͣ�

        Integer i=123;
        String s=i.toString();
        System.out.println(s+1);

        String age="56";
        int age1=Integer.parseInt(age);
        int age2=Integer.valueOf(age);


    }

}
