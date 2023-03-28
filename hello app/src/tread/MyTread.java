package tread;


class main{
    public static void main(String[] args) {
        Thread my = new MyTread();
        my.start();
//每次输出都不同

        for (int i = 0; i < 5; i++) {
            System.out.println("main函数输出"+i);
        }

    }
}

public class MyTread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("线程输出"+i);
        }
    }
}
