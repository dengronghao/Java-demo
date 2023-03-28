package web_program.send_receive;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client3 {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1",7777);

        //����һ���������߳�ר�Ž��ܷ���˵���Ϣ
        new ClientThread(socket).start();

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
    class ClientThread extends Thread {
        private Socket socket;

        public ClientThread(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                InputStream inputStream = socket.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));

                String msg;
                while((msg = br.readLine()) != null){
                    System.out.println(socket.getRemoteSocketAddress()+"˵�ˣ�"+msg);
                }
            } catch (Exception e) {
                System.out.println("����˰����߳�ȥ��");
            }
        }
    }

