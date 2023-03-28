package ThreadPool;

public class Mycall implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"输出"+i);
        }
        try {
            System.out.println(Thread.currentThread().getName()+"本任务与线程绑定，线程进入休眠");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
