package final_use;

import drh.string;

public class finalClass {
    String address;
    public void setAddress(String a){
        this.address=a;
    }
    public final class person{
        string name;

        public final void show(){
            System.out.println("��");
        }

        final int age=10;//����ֻ��һ�����������±���ֵ
    }
    //public class teacher extends person{} final�಻�ܼ̳У�

    public static void main(String[] args) {
        final finalClass f=new finalClass();
         f.setAddress("manchester");
         f.setAddress("guiling");
         //f=null;final���ε��������ͱ������ܸı��ַ

    }
}
