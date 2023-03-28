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

    private final Lock lock = new ReentrantLock();//每个账户有一个锁

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
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();//放到finally里防止死锁
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
