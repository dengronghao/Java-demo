package tread;


class main{
    public static void main(String[] args) {
        Thread my = new MyTread();
        my.start();
//ÿ���������ͬ

        for (int i = 0; i < 5; i++) {
            System.out.println("main�������"+i);
        }

    }
}

public class MyTread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("�߳����"+i);
        }
    }
}
