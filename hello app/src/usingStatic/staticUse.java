package usingStatic;
class staticUse
{
    public static int number=456;//static����ֱ�������������ʣ���world��

    static int getMax(int a,int b)//static���εķ�������������ֱ�ӵ���,��world��
    {
       return a>b?a:b;
    }

    public int getMax1(int a,int b)
    {
        return a>b?a:b;
    }

    static{
        System.out.println("----ʹ��static�����-----");
    }//����һ����أ���������ǰ�棻

    public void show(){
        System.out.println("showing massage");
    }



    public static void main(String[] args) {
        System.out.println(staticUse.number);//static����ֱ��������������
        staticUse s=new staticUse();
        System.out.println(s.number);//Ҳ�ɴ���staticUse���͵Ķ��������ʣ�

        staticUse b=new staticUse();
        System.out.println("bigger:"+staticUse.getMax(99,45));
        System.out.println("bigger:"+b.getMax1(4,8));

        staticUse n=new staticUse();
        n.show();

    }

}
