package tread;

class DEMO{
    public static void main(String[] args) {
        Runnable run11 = new MyRunable();//������󣬼̳нӿ�
        Thread t = new Thread(run11);//������󽻸��߳�
        t.start();

        new Thread(()->{
            for (int i = 0; i < 6; i++) {
                System.out.println("���߳�1���"+i);
            }
        }).start();



        for (int i = 0; i < 5; i++) {
            System.out.println("���߳����"+i);
        }
    }


}

public class MyRunable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("���߳����"+i);
        }
    }
}
