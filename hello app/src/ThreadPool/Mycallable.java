package ThreadPool;

import java.util.concurrent.Callable;

public class Mycallable implements Callable {
    private int n;

    public Mycallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum = sum +n;
        }
        return "ÀÛ¼ÓºÍÊÇ"+sum;
    }
}
