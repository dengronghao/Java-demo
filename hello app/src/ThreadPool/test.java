package ThreadPool;

import java.util.concurrent.*;

public class test {
    public static void main(String[] args) {
        //executorServiceִ���߷���
        //ThreadPoolExecutor�̳߳�ִ����
        //����һ corePoolSize�����߳�
        //������maximumPollSize����߳���
        //������keepAliveTime�����ʱ��
        //������unit��λ
        //������workQueue��������
        //������threadFactory�̹߳���
        //������handlerָ���߳�æ
        //���ʹ���������߳��⣨��ʱ�̣߳����̣߳������߳�æ�������������
        //�ܾ��̣߳���ʱ�̣߳������̣߳�������ж���

        //�̳߳ش���������Runnable,Callable

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
        //������ʱ�߳�
        threadPool.execute(target);
        threadPool.execute(target);
        //�ܾ������߳�

        //�ر��̳߳أ�������һ�㲻ʹ��
        //threadPool.shutdownNow();threadPoll.shutdown();

    }

}
