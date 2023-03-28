package 缓冲流;

import java.io.*;

public class test {
    public static void main(String[] args) {
        //缓冲字节输入输出流 InputStream，FileInputStream,BufferedInputStream;
        //缓冲字符输入输出流 Reader,FileReader,BufferedReader
        //用法几乎一样
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


        //换行newline

    }

}
