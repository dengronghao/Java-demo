package file;

import java.io.File;
import java.io.IOException;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;

public class test {


    public static void main(String[] args) throws IOException {
        //�����ļ���
        File f = new File("D:\\study\\Java\\file_data");//����·��
        File f2 = new File("file.txt");//���·��,����ڹ��̵��ļ�·��
        System.out.println(f.length());//�ֽڴ�С
        //System.out.println(f2.length());
        System.out.println(f.exists());//�ж��ļ����Ƿ����
        System.out.println(f2.getAbsolutePath());//�������·��

        Long time = f.lastModified();
        System.out.println("����޸�ʱ�䣺"+new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time));

        System.out.println(f2.isDirectory());//�Ƿ�Ϊ�ļ��У�
        System.out.println(f.isFile());//�Ƿ�Ϊ�ļ�

        //ʹ���ļ��ഴ���ļ���
        File f3 = new File("D:\\study\\Java\\file_data\\file3.txt");
        System.out.println(f3.createNewFile());


        //����һ��༶Ŀ¼
        File f4 = new File("D:\\study\\Java\\file_data\\aa\\bb");
        System.out.println(f4.mkdirs());//һ��ʹ��mkdir���༶ʹ��mkdirs


        //�ļ���ɾ�����߿��ļ���
        System.out.println(f3.delete());//ɾ���ļ�
        File f5 = new File("D:\\study\\Java\\file_data\\ff");
        System.out.println(f5.delete());//ɾ�����ļ���

        //�ļ��ı������Լ��ļ�����
        File f6 = new File("D:\\study\\Java");
        File[] files = f6.listFiles();//�����ڻ�Ϊ�ļ�����null
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }














    }




}
