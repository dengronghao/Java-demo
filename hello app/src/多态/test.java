package ��̬;

public class test {
    public static void main(String[] args) {
        father f1=new son();//��̬
        f1.show();//��������
        System.out.println(f1.name);//��������

        father f2=new son1();
        System.out.println(f2.name);
        f2.show();
        //f2.like���� ����ʹ�������е����з���

        //ǿ������ת��
        father f3=new son();
        son s=new son();
        s= (son) f3;//ͬ����ʱ�����ʹ�÷�����������

        //son1 s1=(son1) f3;//��ͬ���ͱ���ʱ����������ʱ����
        //�������instanceof
        if(f3 instanceof son)
        {
            son s1=new son();
            s1=(son)f3;
            s1.buy();
        }
        else{
            son1 s2=new son1();
            s2=(son1)f3;
            s2.sell();
        }

    }


}
