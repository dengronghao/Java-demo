package �ַ��ֽ�ת����;

import javax.management.MBeanAttributeInfo;
import java.io.*;

public class test {
    public static void main(String[] args) throws Exception {

        //�ַ��������ת����InputStreamReader,OutStreamWrite;
        InputStream fr = new FileInputStream("");
        Reader is = new InputStreamReader(fr,"GBK");

        OutputStream os = new FileOutputStream("");
        Writer writer1 = new OutputStreamWriter(os,"UTF-8");

    }
}
