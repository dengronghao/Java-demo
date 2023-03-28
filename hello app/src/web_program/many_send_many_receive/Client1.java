package web_program.many_send_many_receive;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Client1 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("输入你想说的内容：");
            String input = sc.nextLine();

            if("exit".equals(input)){
                System.out.println("关闭对话");
                socket.close();
                break;
            }else{
                byte[] buffer = input.getBytes();
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(),1111);
                socket.send(packet);
            }
        }


    }

}
