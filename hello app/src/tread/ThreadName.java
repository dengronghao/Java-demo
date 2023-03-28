package tread;

public class ThreadName {
    public static void main(String[] args) {
        Thread t = new Thread();
        t.setName("线程一");
        t.start();

        Thread ct = Thread.currentThread();//获取当前运行的线程
        System.out.println(ct.getName());



    }
}

class thread extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if(i == 3){
                try {
                    sleep(5);        //线程休眠，单位为毫秒
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
