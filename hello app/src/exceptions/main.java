package exceptions;

public class main {
    public static void main(String[] args) throws self_exception {
        checkAge(-2);
    }

    public static  void checkAge(int age) throws self_exception {
        if(age<0||age>200){
            throw new self_exception(age+"������");
        }else{
            System.out.println("����Ϸ�");
        }
    }
}
