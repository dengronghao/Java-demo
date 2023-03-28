package tread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadCommunication {
    public static void main(String[] args) {//�ȴ�wait������notify
        account1 acc = new account1("00002",10000);

        new DrawThread1(acc,"son2").start();
        new DrawThread1(acc,"son1").start();

        new DepositThread(acc,"father1").start();
        new DepositThread(acc,"father2").start();
        new DepositThread(acc,"father3").start();

    }
}

class account1{
    private String ID;
    private double money;

    private final Lock lock = new ReentrantLock();//ÿ���˻���һ����

    public account1(String ID, double money) {
        this.ID = ID;
        this.money = money;
    }

    public account1() {
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
                    this.notifyAll();//
                    this.wait();//ûǮȡ���ȴ�
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();//�ŵ�finally���ֹ����
            }
        }
    }

    public synchronized void depositMoney(double money){
        String name = Thread.currentThread().getName();

        try {
            if(this.money==0){
                this.money = this.money + money;
                System.out.println(name+"��Ǯ,�����Ϊ"+this.money);
                //��Ǯ����ȡ����
                //����ߵȴ�
                this.notifyAll();
                this.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class DrawThread1 extends Thread{
    private account1 acc;
    public DrawThread1(){

    }
    public DrawThread1(account1 acc,String name){
        super(name);
        this.acc = acc;
    }
    @Override
    public void run() {
        while(true){          //����ѭ�������ֵȴ��ͻ��ѵ�Ч��
            acc.drawMoney(10000);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class DepositThread extends Thread{
    private account1 acc;
    public DepositThread(){

    }
    public DepositThread(account1 acc,String name){
        super(name);
        this.acc = acc;
    }
    @Override
    public void run() {
        while(true){          //����ѭ�������ֵȴ��ͻ��ѵ�Ч��
            acc.depositMoney(10000);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
}

