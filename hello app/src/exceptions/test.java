package exceptions;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            try {
                System.out.println("�������ļ۸�����Ϊ����");
                String price = sc.nextLine();

                double price1=Double.valueOf(price);

                if(price1>0){
                    System.out.println("������ȷ");
                    break;
                }else{
                    System.out.println("�������Ϊ����");
                }
            } catch (NumberFormatException e) {
                System.out.println("���������⣬��������");
            }
        }
    }



}
