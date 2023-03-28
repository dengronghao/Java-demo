package web_program;

import java.io.IOException;
import java.net.InetAddress;

public class Test {
    //客户端服务端
    //client-server
    //browser/server

    //网络通信
    //关键ip地址（定位主机，唯一标志），端口，协议

    //端口：识别程序，十六位二进制

    //协议：连接和通信的规则
    //udp协议（创数控制），不可靠
    //tcp协议（用户数据），三次握手链接，四次挥手断开，可靠
    //即时通讯
    //模拟bs系统

    //ip（ipv4，ipv6）
    //查看IP ipconfig
    //本机ip localhost：127.....

    public static void main(String[] args) throws IOException {
        System.out.println(InetAddress.getLocalHost());
        //域名ip
        System.out.println("hello");
        InetAddress ip = InetAddress.getByName("www.baidu.com");
        System.out.println(ip.getHostAddress());

/*        //公网IP
        InetAddress IP1 =   InetAddress.getByName("14.215.177.38");
        System.out.println(IP1.getHostName());
        System.out.println(IP1.getHostAddress());*/

        //查看ip的链接状态
        System.out.println(ip.isReachable(5000));


    }
}
