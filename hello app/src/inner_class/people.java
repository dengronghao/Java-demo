package inner_class;

public class people {

    public static int number=100;
    private String name1="��";

    //��̬�ڲ���
        /*public static class heart {
        String name = "����";

        public void show() {
            System.out.println(name);
            System.out.println(number);//����ʹ���ⲿ��̬��Ա
            //System.out.println(people.name);���ܷ����ⲿ��˽�г�Ա
        }*/

        //��Ա�ڲ���
        public class hand {
            String name2 = "hand";

            public void show() {
                System.out.println(name1);
                System.out.println(people.number);
                System.out.println(name2);//��Ա�ڲ�����Է����ⲿ���˽�г�Ա
                System.out.println(people.this.name1);//���ַ�������ⲿ���˽�г�Ա
            }
        }
    }



