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
            System.out.println("好");
        }

        final int age=10;//有且只有一个，不能重新被赋值
    }
    //public class teacher extends person{} final类不能继承；

    public static void main(String[] args) {
        final finalClass f=new finalClass();
         f.setAddress("manchester");
         f.setAddress("guiling");
         //f=null;final修饰的引用类型变量不能改变地址

    }
}
