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

        ps.println("234");//����
        ps.close();


        //PrintWriter,ʹ�÷���һ��


        //�л������ָ���ļ�
        PrintStream ps1 = new PrintStream("");
        System.setOut(ps1);
        System.out.println("�ʼ������");
        System.out.println("��������");


        //properties����ֵ����Map����,����ֵ����Ϣ���浽ָ���ļ�
        Properties m = new Properties();
        m.put("root","et");
        m.put("password","123123");
        m.store(new FileWriter(""),"�����Ϣ");

        //properties��ȡ�ļ���Ϣ
        m.load(new FileReader(""));

        //IO���commons-io
        IOUtils.copy(new FileInputStream(""),new FileOutputStream(""));//�ļ�����

        //�����ļ���ĳ���ļ���
        FileUtils.copyDirectory(new File(""),new File(""));

        //�ļ��е��ļ���
        FileUtils.copyDirectoryToDirectory(new File(""),new File(""));

        //ɾ���ļ���,������
        FileUtils.deleteDirectory(new File(""));






    }
}
