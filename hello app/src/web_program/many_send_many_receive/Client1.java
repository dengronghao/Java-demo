package web_program.many_send_many_receive;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Client1 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("��������˵�����ݣ�");
            String input = sc.nextLine();

            if("exit".equals(input)){
                System.out.println("�رնԻ�");
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
