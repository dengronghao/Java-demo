package ������;

import java.io.*;

public class test {
    public static void main(String[] args) {
        //�����ֽ���������� InputStream��FileInputStream,BufferedInputStream;
        //�����ַ���������� Reader,FileReader,BufferedReader
        //�÷�����һ��
        try {
            Reader r = new FileReader("");
            BufferedReader br = new BufferedReader(r);

            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //����newline

    }

}
