package 字符字节转换流;

import javax.management.MBeanAttributeInfo;
import java.io.*;

public class test {
    public static void main(String[] args) throws Exception {

        //字符输入输出转换流InputStreamReader,OutStreamWrite;
        InputStream fr = new FileInputStream("");
        Reader is = new InputStreamReader(fr,"GBK");

        OutputStream os = new FileOutputStream("");
        Writer writer1 = new OutputStreamWriter(os,"UTF-8");

    }
}
