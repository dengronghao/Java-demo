package usingStatic;

public class singleInstance2 {//������������Ҫ�Ŵ�����
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
