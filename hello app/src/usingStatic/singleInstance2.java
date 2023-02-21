package usingStatic;

public class singleInstance2 {//懒汉单例，需要才创建；
    private singleInstance2() {
    }
    private static singleInstance2 instance=null;

    public static singleInstance2 getInstance(){
        if(instance==null)
        {
            instance=new singleInstance2();
        }
        return instance;
    }

}
