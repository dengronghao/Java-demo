package Input_Output;

import java.io.*;
import java.util.Arrays;
//IO����Ϊ�ֽ������ַ���

public class test {
    //����ͽ���


    public static void main(String[] args) throws IOException {
        //����UTF-8
        String name = "��������������";
        byte[] Byte = name.getBytes("GBK");//ָ��GBK����
        //byte[] Byte = name.getBytes("UTF-8");//ָ��UTF-8
        System.out.println(Byte.length);
        System.out.println(Arrays.toString(Byte));
        //����
        String bytes = new String(Byte);
        System.out.println(bytes);


        //�ļ��ֽ���
        //һ���ֽ�һ���ֽڶ�
        InputStream stream = new FileInputStream("D:\\study\\Java\\first java\\hello app\\src\\file.txt");
/*        int a1 = stream.read();
        System.out.println((char)a1);

        int a2 = stream.read();
        System.out.println((char)a2);*/

        //�޷���ȡ����
        int isOver;
        while ((isOver = stream.read()) != -1){
            System.out.print((char)isOver);
        }


        //�ļ���������ÿ�ζ�ȡһ������,��ȡ��Ϸ���-1;
        byte[] b = new byte[3];//kb
        stream.read(b);//���浽���������
        String s = new String(b);
        System.out.println(s);

//        byte[] b1 = new byte[3];
//        int len = stream.read(b1);
//        String s1 = new String(b1,0,len);
//        System.out.println(s1);

        byte[] b2 = new byte[3];
        int len;
        while((len = stream.read(b2))!=-1){
            System.out.println(new String(b2,0,len));
        }
















    }
}

