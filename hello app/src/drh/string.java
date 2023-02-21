package drh;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class string {

    public static void main(String[] args) {
        String a = "DB7";
        String b = "DB7";
        //a和b相等；有“”圈出来的且相等，a and b公有；

        char[] chars = {'a', 'b', 'c', 'd'};
        String c = new String(chars);
        String d = new String(chars);
        //c和d用new创建了两个不同的字符串，地址不同；

        String a1 = "abc";
        String a2 = "a" + "b" + "c";
        //a1和a2相等

        String c1 = "mike";
        Scanner in = new Scanner(System.in);
        String d1 = in.nextLine();
        d1.equals(c1);
        //字符串内容的比较不能用==；“==”比较的是地址；

    }
}
