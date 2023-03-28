package printStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.util.Map;
import java.util.Properties;

public class test {

    public static void main(String[] args) throws Exception {
        //PrintStream
        //PrintStream ps = new PrintStream(new FileOutputStream("",true));
        PrintStream ps = new PrintStream("");

        ps.println("234");//换行
        ps.close();


        //PrintWriter,使用方法一样


        //切换输出到指定文件
        PrintStream ps1 = new PrintStream("");
        System.setOut(ps1);
        System.out.println("皇家马德里");
        System.out.println("巴塞罗那");


        //properties属性值对象Map集合,将键值对信息储存到指定文件
        Properties m = new Properties();
        m.put("root","et");
        m.put("password","123123");
        m.store(new FileWriter(""),"球队信息");

        //properties读取文件信息
        m.load(new FileReader(""));

        //IO框架commons-io
        IOUtils.copy(new FileInputStream(""),new FileOutputStream(""));//文件复制

        //复制文件到某个文件夹
        FileUtils.copyDirectory(new File(""),new File(""));

        //文件夹到文件夹
        FileUtils.copyDirectoryToDirectory(new File(""),new File(""));

        //删除文件夹,有内容
        FileUtils.deleteDirectory(new File(""));






    }
}
