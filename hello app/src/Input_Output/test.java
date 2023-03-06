package Input_Output;

import java.io.*;
import java.util.Arrays;
//IO流分为字节流和字符流

public class test {
    //编码和解码


    public static void main(String[] args) throws IOException {
        //编码UTF-8
        String name = "发动进攻阿飞如";
        byte[] Byte = name.getBytes("GBK");//指定GBK解码
        //byte[] Byte = name.getBytes("UTF-8");//指定UTF-8
        System.out.println(Byte.length);
        System.out.println(Arrays.toString(Byte));
        //解码
        String bytes = new String(Byte);
        System.out.println(bytes);


        //文件字节流
        //一个字节一个字节读
        InputStream stream = new FileInputStream("D:\\study\\Java\\first java\\hello app\\src\\file.txt");
/*        int a1 = stream.read();
        System.out.println((char)a1);

        int a2 = stream.read();
        System.out.println((char)a2);*/

        //无法读取中文
        int isOver;
        while ((isOver = stream.read()) != -1){
            System.out.print((char)isOver);
        }


        //文件输入流，每次读取一个数组,读取完毕返回-1;
        byte[] b = new byte[3];//kb
        stream.read(b);//储存到这个数组中
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

