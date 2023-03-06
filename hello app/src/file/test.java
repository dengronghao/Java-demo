package file;

import java.io.File;
import java.io.IOException;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;

public class test {


    public static void main(String[] args) throws IOException {
        //创建文件类
        File f = new File("D:\\study\\Java\\file_data");//绝对路径
        File f2 = new File("file.txt");//相对路径,相对于工程的文件路径
        System.out.println(f.length());//字节大小
        //System.out.println(f2.length());
        System.out.println(f.exists());//判断文件夹是否存在
        System.out.println(f2.getAbsolutePath());//输出绝对路径

        Long time = f.lastModified();
        System.out.println("最后修改时间："+new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time));

        System.out.println(f2.isDirectory());//是否为文件夹；
        System.out.println(f.isFile());//是否为文件

        //使用文件类创建文件夹
        File f3 = new File("D:\\study\\Java\\file_data\\file3.txt");
        System.out.println(f3.createNewFile());


        //创建一或多级目录
        File f4 = new File("D:\\study\\Java\\file_data\\aa\\bb");
        System.out.println(f4.mkdirs());//一级使用mkdir，多级使用mkdirs


        //文件的删除或者空文件夹
        System.out.println(f3.delete());//删除文件
        File f5 = new File("D:\\study\\Java\\file_data\\ff");
        System.out.println(f5.delete());//删除空文件夹

        //文件的遍历，以及文件对象
        File f6 = new File("D:\\study\\Java");
        File[] files = f6.listFiles();//不存在或为文件返回null
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }














    }




}
