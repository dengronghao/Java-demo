package 多态;

public class test {
    public static void main(String[] args) {
        father f1=new son();//多态
        f1.show();//方法看右
        System.out.println(f1.name);//变量看左

        father f2=new son1();
        System.out.println(f2.name);
        f2.show();
        //f2.like（） 不能使用子类中的特有方法

        //强制类型转换
        father f3=new son();
        son s=new son();
        s= (son) f3;//同类型时编译和使用方法都不报错

        //son1 s1=(son1) f3;//不同类型编译时不报错，运行时报错；
        //解决方法instanceof
        if(f3 instanceof son)
        {
            son s1=new son();
            s1=(son)f3;
            s1.buy();
        }
        else{
            son1 s2=new son1();
            s2=(son1)f3;
            s2.sell();
        }

    }


}
