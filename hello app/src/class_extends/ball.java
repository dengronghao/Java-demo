package class_extends;

public class ball extends circle {
    public String name="球";
    //重写的要求：名称,返回值，参数要相同；私用不能重写；
    @Override public double area()//说明重载；
    {
        return 4*super.area();
    }
    public double volume(){
       return 3*getR()*getR()*getR()/4;
    }

    public void show_fathersName(){
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        ball a=new ball();
        a.setR(5);
        System.out.println("area:"+a.area());
        System.out.println("volume:"+a.volume());
        a.show_fathersName();
    }
}
