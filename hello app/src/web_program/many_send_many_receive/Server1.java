package web_program.many_send_many_receive;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server1 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(1111);

        // ����һ�����ݰ���������������
        byte[] buffer = new byte[1024*64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        while(true){
            socket.receive(packet);
            int len = packet.getLength();

            String rec = new String(buffer,0,len);
            System.out.println("�յ�������"+packet.getSocketAddress()+"ip,"+packet.getPort()+"�˿ڵģ�"+rec);
        }

    }
}
