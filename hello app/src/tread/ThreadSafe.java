package tread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadSafe {
    public static void main(String[] args) {
        account acc = new account("10086",10000);

        new DrawThread(acc,"husband").start();
        new DrawThread(acc,"wife").start();
    }

}

class account{
    private String ID;
    private double money;

    private final Lock lock = new ReentrantLock();//ÿ���˻���һ����

    public account(String ID, double money) {
        this.ID = ID;
        this.money = money;
    }

    public account() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public static void show(){
        synchronized (account.class) {//��̬�����Ĵ����ʹ������.class
            System.out.println("ȡǮ");
        }
    }


    public  synchronized void drawMoney(double money){//ͬ��������ֻ����һ�����̣���Ҫ�߶��������
        String name = Thread.currentThread().getName();
        lock.lock();
        synchronized (this) {//ͬ������飬alt+ctrl+t;thisָ��ǰ�˻�������Ӱ�������˻�
            try {
                if(this.money>=money){
                    System.out.println(name+"ȡǮ"+money);
                    this.money=this.money-money;
                }else{
                    System.out.println("����");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();//�ŵ�finally���ֹ����
            }
        }


    }
}

class DrawThread extends Thread{
    private account acc;
    public DrawThread(){

    }
    public DrawThread(account acc,String name){
        super(name);
        this.acc = acc;
    }
    @Override
    public void run() {
        acc.drawMoney(10000);
    }
}
