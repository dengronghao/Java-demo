package tread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadCommunication {
    public static void main(String[] args) {//等待wait，唤醒notify
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

    private final Lock lock = new ReentrantLock();//每个账户有一个锁

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
        synchronized (account.class) {//静态方法的代码块使用类名.class
            System.out.println("取钱");
        }
    }


    public  synchronized void drawMoney(double money){//同步方法，只进行一个进程，需要高度面向对象
        String name = Thread.currentThread().getName();
        lock.lock();
        synchronized (this) {//同步代码块，alt+ctrl+t;this指当前账户，不会影响其他账户
            try {
                if(this.money>=money){
                    System.out.println(name+"取钱"+money);
                    this.money=this.money-money;
                }else{
                    System.out.println("余额不足");
                    this.notifyAll();//
                    this.wait();//没钱取，等待
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();//放到finally里防止死锁
            }
        }
    }

    public synchronized void depositMoney(double money){
        String name = Thread.currentThread().getName();

        try {
            if(this.money==0){
                this.money = this.money + money;
                System.out.println(name+"存钱,现余额为"+this.money);
                //有钱后唤醒取款者
                //存款者等待
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
        while(true){          //利用循环来体现等待和唤醒的效果
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
        while(true){          //利用循环来体现等待和唤醒的效果
            acc.depositMoney(10000);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
}

