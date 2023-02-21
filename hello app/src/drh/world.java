package drh;

import class_extends.ball;
import class_extends.circle;
import usingStatic.string_static_checknumber;

import java.util.Scanner;

public class world {
    public static void main(String[] args) {
        System.out.println("hello world");
        String name;
        Scanner scanner=new Scanner(System.in);

        int a= scanner.nextInt();//空格为止454
        String address= scanner.nextLine();//可以有空格

        System.out.println("a:"+a+"...."+"address:"+address);
        name="david beckham";
        System.out.println(name);

        String chekNumber= string_static_checknumber.checkNumber_util(5);
        System.out.println(chekNumber);



    }
}



