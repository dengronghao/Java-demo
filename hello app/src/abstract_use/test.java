package abstract_use;

public class test {
    public static void main(String[] args) {
        dog a=new dog();
        a.run();
        a.show();
        //抽象类只能作为父类，不能创建对象；
       //animal b=new animal();'animal' is abstract; cannot be instantiated

        //final和abstract是互斥关系；一个只能被继承一个不能被继承，一个不能重载一个只能被重载；
    }
}
