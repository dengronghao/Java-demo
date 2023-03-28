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

        //ReadAllByte读取全部文件数据，不会出现乱码；


        //写数据到指定文件
        //OutputStream is = new FileOutputStream("D:\\study\\Java\\file_data\\aa\\bb\\filestream.txt",true);//覆盖管道，先清空在写入
        OutputStream is = new FileOutputStream("D:\\study\\Java\\file_data\\aa\\bb\\filestream.txt",true);//追加管道
        is.write('a');
        is.write("\r\n".getBytes());//换行
        is.write(98);//中文的写会乱码
        byte[] out ={'c','d','e'};
        is.write(out);


        //缓存数据和刷新数据
        is.flush();
        is.close();//释放和刷新,释放后不能在使用

        //文件拷贝，字节流实现文件复制
        //创建输入输出流对象；
/*        OutputStream output = null;//输出流
        InputStream input =null;
        try {
            input = new FileInputStream("");//输入流
            output = new FileOutputStream("");

            byte[] contain = new byte[1024];
            int temp;//字节数

            while((temp = input.read(contain)) !=-1){
                output.write(contain,0,temp);
            }
            System.out.println("文件复制完成");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {     //finally一定被最后执行，适合做收尾工作
            output.flush();
            output.close();
        }*/

        //简化释放资源（）内只能写资源（input，output stream），具有AntoClose
        try(InputStream input = new FileInputStream("");
            OutputStream output = new FileOutputStream("");) {

            byte[] contain = new byte[1024];
            int temp;//字节数

            while((temp = input.read(contain)) !=-1){
                output.write(contain,0,temp);}

            System.out.println("文件复制完成");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }//自动调用收尾工作


        //文件字符流，擅长中文的读取
        //每次读取一个字符
        Reader reader = new FileReader("");
/*        int code = reader.read();
        System.out.println((char)code);*/
        int code;
        while((code = reader.read())!=-1){
            System.out.println((char)code);
        }

        //读取文件到字符数组
        Reader reader1 = new FileReader("");
        char[] chars = new char[1024];//一次的容量
        int nums=0;

        while((nums= reader1.read(chars))!=-1){
            String st = new String(chars,0,len);
            System.out.println(st);

        }

        //字符输入流
/*        Writer writer = new FileWriter("");*/
        Writer writer = new FileWriter("",true);
        char[] chars1 = {'邓','a','e'};
        writer.write(chars1);
        writer.write("\r\n");//换行
        writer.write('d');
        writer.write(chars1,4, chars1.length);//截取一段数据

        writer.flush();
        writer.close();

    }
}

