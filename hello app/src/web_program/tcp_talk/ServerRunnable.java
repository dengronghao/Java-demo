package web_program.tcp_talk;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerRunnable implements Runnable{
    private Socket socket;

    public ServerRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream inputStream = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

            String msg;
            while((msg = br.readLine()) != null){
                System.out.println(socket.getRemoteSocketAddress()+"说了："+msg);
            }
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress()+"下线了");
        }
    }
}
