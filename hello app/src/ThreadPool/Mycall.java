package ThreadPool;

public class Mycall implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"���"+i);
        }
        try {
            System.out.println(Thread.currentThread().getName()+"���������̰߳󶨣��߳̽�������");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
