package lambda;

public class test {
    public static void main(String[] args) {
        shoot s=new shoot() {
            @Override
            public void shoot() {
                System.out.println("Բ���䵶");
            }
        };

        //lambda��һ���������ڲ��ࣻ
        //lambdaֻ�ܼ򻯽ӿڣ����ҽӿ�ֻ����һ��������
        shoot s1=()->{
            System.out.println("������");
        };


    }
}
