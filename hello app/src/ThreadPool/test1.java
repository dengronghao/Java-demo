package ThreadPool;

import javax.management.MBeanAttributeInfo;
import java.util.concurrent.*;

public class test1 {

    public static void main(String[] args) {
        ExecutorService threadPool = new ThreadPoolExecutor(3,5,6, TimeUnit.SECONDS,new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        threadPool.submit(new Mycallable(100));
    }
}
