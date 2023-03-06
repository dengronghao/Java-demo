package exceptions;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            try {
                System.out.println("输入和里的价格，期望为正数");
                String price = sc.nextLine();

                double price1=Double.valueOf(price);

                if(price1>0){
                    System.out.println("输入正确");
                    break;
                }else{
                    System.out.println("输入必须为正数");
                }
            } catch (NumberFormatException e) {
                System.out.println("输入有问题，重新输入");
            }
        }
    }



}
