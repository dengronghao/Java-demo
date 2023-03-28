package web_program.tcp_talk;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1",7777);
        OutputStream os = socket.getOutputStream();
        Scanner scanner = new Scanner(System.in);
        PrintStream ps = new PrintStream(os);
        while(true){
            System.out.println("��������Ҫ˵�Ļ���");
            String msg = scanner.nextLine();
            if("exit".equals(msg)){
                break;
            }
            ps.println(msg);
            ps.flush();
        }
    }
}
