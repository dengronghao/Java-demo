package tread;

public class ThreadName {
    public static void main(String[] args) {
        Thread t = new Thread();
        t.setName("�߳�һ");
        t.start();

        Thread ct = Thread.currentThread();//��ȡ��ǰ���е��߳�
        System.out.println(ct.getName());



    }
}

class thread extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if(i == 3){
                try {
                    sleep(5);        //�߳����ߣ���λΪ����
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
