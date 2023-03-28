package ThreadPool;

import java.util.concurrent.*;

public class test {
    public static void main(String[] args) {
        //executorService执行者服务
        //ThreadPoolExecutor线程池执行者
        //参数一 corePoolSize核心线程
        //参数二maximumPollSize最大线程数
        //参数三keepAliveTime最大存活时间
        //参数四unit单位
        //参数五workQueue工作队列
        //参数六threadFactory线程工厂
        //参数七handler指定线程忙
        //如何使创建核心线程外（临时线程）新线程：核心线程忙，且任务队列满
        //拒绝线程：临时线程，核心线程，任务队列都满

        //线程池创建，接受Runnable,Callable

        ExecutorService threadPool = new ThreadPoolExecutor(3,5,6, TimeUnit.SECONDS,new ArrayBlockingQueue<>(5),Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        Runnable target = new Mycall();

        //
        threadPool.execute(target);
        threadPool.execute(target);
        threadPool.execute(target);

        threadPool.execute(target);
        threadPool.execute(target);
        threadPool.execute(target);
        threadPool.execute(target);
        threadPool.execute(target);
        threadPool.execute(target);
        //创建临时线程
        threadPool.execute(target);
        threadPool.execute(target);
        //拒绝创建线程

        //关闭线程池，开发中一般不使用
        //threadPool.shutdownNow();threadPoll.shutdown();

    }

}
