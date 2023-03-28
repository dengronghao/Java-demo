package Timer1;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Timer1 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"ִ��aa");
            }
        },0,5000);
//��Ӱ������ִ�У������쳣Ҳ��Ӱ����������ִ��
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"ִ��bb");
            }
        },0,2000);


        //�̳߳أ��������ȱ��
        ScheduledExecutorService pool = new ScheduledThreadPoolExecutor(3);
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println();
            }
        },0,2, TimeUnit.SECONDS);
    }
}
