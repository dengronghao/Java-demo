package API_StringBuilder;

public class test {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();
        s.append("�ʼ�");
        s.append("�����");
        s.append("����").append("��һ���ֲ�");

        StringBuilder s1=s.reverse();

        System.out.println(s);
        System.out.println(s1);

        //�������Ҫת����string��
        s.toString();
        s1.toString();
    }
}
