package 可变参数;

public class test {
    public static void main(String[] args) {
         sum(12,1,2,2,4,5,6);//age为，num实质是数组；
        //一个参数链表中只能有一个可变参数，并且在追前面；
    }

    public static int sum(int age,int...num){
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum=+num[i];
        }
        return sum+age;
    }

}
