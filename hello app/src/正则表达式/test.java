package ������ʽ;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //�ֻ�����
        Scanner s=new Scanner(System.in);
        String phone=s.next();

        if(phone.matches("1[3-9]\\d{9}"))
        {
            System.out.println("right");
        }

        else
        {
            System.out.println("wrong");
        }


        String mail=s.next();
        if(mail.matches("\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}"))
        {
            System.out.println("right");
        }

        else
        {
            System.out.println("wrong");
        }


        String information=("�ʼ������fuhuihuh��������sdafjhlji�ж���");
        String arr[]=information.split("\\w+");
        for (int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }


    }

}
