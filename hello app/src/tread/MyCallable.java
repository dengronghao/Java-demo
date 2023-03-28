package tread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallable {
    public static void main(String[] args) {
        //可以得到返回结果，FutureTask
        Callable<String> call = new M_CallAble(50);

        //FutureTask为Runnable对象，调用其get方法获取结果
        FutureTask<String> ft = new FutureTask<>(call);

        Thread t = new Thread(ft);
        t.start();

        try {
            String result = ft.get();
            System.out.println("结果："+result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

    }
}

class M_CallAble implements Callable<String> {
    //重写call方法

    private int n;

    public M_CallAble(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum = sum +n;
        }
        return "累加和是"+sum;
    }
}
