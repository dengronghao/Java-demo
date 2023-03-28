package web_program.one_send_one_receive;

import java.io.IOException;
import java.net.*;

public class Server {

    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8888);

        // ����һ�����ݰ���������������
        byte[] buffer = new byte[1024*64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        socket.receive(packet);

        //��ȡ���Ͷ˵�ip�Ͷ˿�
        System.out.println("���Ͷ�ip��"+packet.getSocketAddress().toString());

        System.out.println("���Ͷ˶˿ڣ�"+socket.getPort());

        int len = packet.getLength();

        String rec = new String(buffer,0,len);
        System.out.println("�յ��ˣ�"+rec);

        socket.close();
    }

}
