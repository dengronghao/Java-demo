package lambda;

public class test {
    public static void main(String[] args) {
        shoot s=new shoot() {
            @Override
            public void shoot() {
                System.out.println("圆月弯刀");
            }
        };

        //lambda进一步简化匿名内部类；
        //lambda只能简化接口，并且接口只能有一个函数；
        shoot s1=()->{
            System.out.println("电梯球");
        };


    }
}
