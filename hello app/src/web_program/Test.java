package web_program;

import java.io.IOException;
import java.net.InetAddress;

public class Test {
    //�ͻ��˷����
    //client-server
    //browser/server

    //����ͨ��
    //�ؼ�ip��ַ����λ������Ψһ��־�����˿ڣ�Э��

    //�˿ڣ�ʶ�����ʮ��λ������

    //Э�飺���Ӻ�ͨ�ŵĹ���
    //udpЭ�飨�������ƣ������ɿ�
    //tcpЭ�飨�û����ݣ��������������ӣ��Ĵλ��ֶϿ����ɿ�
    //��ʱͨѶ
    //ģ��bsϵͳ

    //ip��ipv4��ipv6��
    //�鿴IP ipconfig
    //����ip localhost��127.....

    public static void main(String[] args) throws IOException {
        System.out.println(InetAddress.getLocalHost());
        //����ip
        System.out.println("hello");
        InetAddress ip = InetAddress.getByName("www.baidu.com");
        System.out.println(ip.getHostAddress());

/*        //����IP
        InetAddress IP1 =   InetAddress.getByName("14.215.177.38");
        System.out.println(IP1.getHostName());
        System.out.println(IP1.getHostAddress());*/

        //�鿴ip������״̬
        System.out.println(ip.isReachable(5000));


    }
}
