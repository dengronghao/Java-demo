package class_extends;

public class ball extends circle {
    public String name="��";
    //��д��Ҫ������,����ֵ������Ҫ��ͬ��˽�ò�����д��
    @Override public double area()//˵�����أ�
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
