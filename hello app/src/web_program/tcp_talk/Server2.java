package web_program.tcp_talk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class Server2 {
    private static ExecutorService pool = new ThreadPoolExecutor(3,5,6, TimeUnit.SECONDS,new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(7777);
/*        while(true){
            Socket socket = serverSocket.accept();
            new ServerThread(socket).start();
        }
        //多线程实现接收多个client*/

        //线程池优化
        while(true){
            Socket socket = serverSocket.accept();
            Runnable target = new ServerRunnable(socket);
            pool.execute(target);
            new ServerThread(socket).start();
        }

    }
}
