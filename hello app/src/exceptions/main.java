package exceptions;

public class main {
    public static void main(String[] args) throws self_exception {
        checkAge(-2);
    }

    public static  void checkAge(int age) throws self_exception {
        if(age<0||age>200){
            throw new self_exception(age+"不合理");
        }else{
            System.out.println("输入合法");
        }
    }
}
