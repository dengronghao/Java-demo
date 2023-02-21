package usingStatic;

public class static_singleinstance {

    public static static_singleinstance instance=new static_singleinstance();//单例类，饿汉单例，提前加载，只有一个
    private static_singleinstance() {
    }

    public static void main(String[] args) {
        static_singleinstance s1=instance;
        static_singleinstance s2=instance;
        System.out.println(s1);
        System.out.println(s2);
    }
}
