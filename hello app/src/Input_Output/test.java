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

        //ReadAllByte��ȡȫ���ļ����ݣ�����������룻


        //д���ݵ�ָ���ļ�
        //OutputStream is = new FileOutputStream("D:\\study\\Java\\file_data\\aa\\bb\\filestream.txt",true);//���ǹܵ����������д��
        OutputStream is = new FileOutputStream("D:\\study\\Java\\file_data\\aa\\bb\\filestream.txt",true);//׷�ӹܵ�
        is.write('a');
        is.write("\r\n".getBytes());//����
        is.write(98);//���ĵ�д������
        byte[] out ={'c','d','e'};
        is.write(out);


        //�������ݺ�ˢ������
        is.flush();
        is.close();//�ͷź�ˢ��,�ͷź�����ʹ��

        //�ļ��������ֽ���ʵ���ļ�����
        //�����������������
/*        OutputStream output = null;//�����
        InputStream input =null;
        try {
            input = new FileInputStream("");//������
            output = new FileOutputStream("");

            byte[] contain = new byte[1024];
            int temp;//�ֽ���

            while((temp = input.read(contain)) !=-1){
                output.write(contain,0,temp);
            }
            System.out.println("�ļ��������");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {     //finallyһ�������ִ�У��ʺ�����β����
            output.flush();
            output.close();
        }*/

        //���ͷ���Դ������ֻ��д��Դ��input��output stream��������AntoClose
        try(InputStream input = new FileInputStream("");
            OutputStream output = new FileOutputStream("");) {

            byte[] contain = new byte[1024];
            int temp;//�ֽ���

            while((temp = input.read(contain)) !=-1){
                output.write(contain,0,temp);}

            System.out.println("�ļ��������");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }//�Զ�������β����


        //�ļ��ַ������ó����ĵĶ�ȡ
        //ÿ�ζ�ȡһ���ַ�
        Reader reader = new FileReader("");
/*        int code = reader.read();
        System.out.println((char)code);*/
        int code;
        while((code = reader.read())!=-1){
            System.out.println((char)code);
        }

        //��ȡ�ļ����ַ�����
        Reader reader1 = new FileReader("");
        char[] chars = new char[1024];//һ�ε�����
        int nums=0;

        while((nums= reader1.read(chars))!=-1){
            String st = new String(chars,0,len);
            System.out.println(st);

        }

        //�ַ�������
/*        Writer writer = new FileWriter("");*/
        Writer writer = new FileWriter("",true);
        char[] chars1 = {'��','a','e'};
        writer.write(chars1);
        writer.write("\r\n");//����
        writer.write('d');
        writer.write(chars1,4, chars1.length);//��ȡһ������

        writer.flush();
        writer.close();

    }
}

