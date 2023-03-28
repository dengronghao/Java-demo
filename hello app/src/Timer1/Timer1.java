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
                System.out.println(Thread.currentThread().getName()+"执行aa");
            }
        },0,5000);
//会影响其他执行，出现异常也会影响其他任务执行
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行bb");
            }
        },0,2000);


        //线程池，解决以上缺陷
        ScheduledExecutorService pool = new ScheduledThreadPoolExecutor(3);
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println();
            }
        },0,2, TimeUnit.SECONDS);
    }
}
