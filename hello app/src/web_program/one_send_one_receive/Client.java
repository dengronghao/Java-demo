package web_program.one_send_one_receive;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args) throws IOException {
        //�������Ͷ˶���
        DatagramSocket socket = new DatagramSocket();

        byte[] buffer = "���� et".getBytes();
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(),8888);

        socket.send(packet);

    }
}
