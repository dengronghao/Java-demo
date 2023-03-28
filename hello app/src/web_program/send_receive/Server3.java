package web_program.send_receive;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server3 {
    public static ArrayList<Socket> AllOnlineSocket = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(7777);
       while(true){
            Socket socket = serverSocket.accept();
           System.out.println("来了老弟");
           AllOnlineSocket.add(socket);
            new ServerThread(socket).start();

        }
    }
}

class ServerThread extends Thread{
    private Socket socket;

    public ServerThread(Socket socket) {
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
                sendMessageToAll(msg);
            }
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress()+"下线了");
            Server3.AllOnlineSocket.remove(socket);
        }
    }

    private void sendMessageToAll(String msg) throws IOException {
        for (Socket socket1 : Server3.AllOnlineSocket) {
            PrintStream ps = new PrintStream(socket1.getOutputStream());
            ps.println(msg);
            ps.flush();
        }
    }
}
