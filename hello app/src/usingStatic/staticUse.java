package usingStatic;
class staticUse
{
    public static int number=456;//static可以直接用类名来访问，见world类

    static int getMax(int a,int b)//static修饰的方法可以用类名直接调用,见world类
    {
       return a>b?a:b;
    }

    public int getMax1(int a,int b)
    {
        return a>b?a:b;
    }

    static{
        System.out.println("----使用static代码块-----");
    }//和类一起加载，出现在最前面；

    public void show(){
        System.out.println("showing massage");
    }



    public static void main(String[] args) {
        System.out.println(staticUse.number);//static可以直接用类名来访问
        staticUse s=new staticUse();
        System.out.println(s.number);//也可创建staticUse类型的对象来访问；

        staticUse b=new staticUse();
        System.out.println("bigger:"+staticUse.getMax(99,45));
        System.out.println("bigger:"+b.getMax1(4,8));

        staticUse n=new staticUse();
        n.show();

    }

}
