package web_program.one_send_one_receive;

import java.io.IOException;
import java.net.*;

public class Server {

    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8888);

        // 创建一个数据包对象来接收数据
        byte[] buffer = new byte[1024*64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        socket.receive(packet);

        //获取发送端的ip和端口
        System.out.println("发送端ip："+packet.getSocketAddress().toString());

        System.out.println("发送端端口："+socket.getPort());

        int len = packet.getLength();

        String rec = new String(buffer,0,len);
        System.out.println("收到了："+rec);

        socket.close();
    }

}
