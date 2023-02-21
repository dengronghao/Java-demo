package 匿名内部类;

public class person {
    public static void main(String[] args) {
        people a=new people() {
            @Override
            void show() {
                super.show();{
                    System.out.println("fsgjkhruiy");
                }
            }
        };
//直接重载抽象类的成员函数，省去在创建一个类的重写
        a.show();
    }
}
