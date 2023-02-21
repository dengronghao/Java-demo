package abstract_use;

public class dog extends animal{
    @Override
    public void run(){
        System.out.println("a running god");//父抽象类中有的抽象方法子类中都要全部重载；
    }

    @Override
    public void show() {
        System.out.println("巴塞罗那");
    }
}
