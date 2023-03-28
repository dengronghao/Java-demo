package tread;

class DEMO{
    public static void main(String[] args) {
        Runnable run11 = new MyRunable();//任务对象，继承接口
        Thread t = new Thread(run11);//任务对象交给线程
        t.start();

        new Thread(()->{
            for (int i = 0; i < 6; i++) {
                System.out.println("子线程1输出"+i);
            }
        }).start();



        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出"+i);
        }
    }


}

public class MyRunable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程输出"+i);
        }
    }
}
