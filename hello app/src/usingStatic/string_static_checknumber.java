package usingStatic;

import java.util.Random;

public  class string_static_checknumber {
//�����뾭����ʹ�ã������д�ɹ����࣬��static�ඨ�壬ֱ��ʹ������������

    private string_static_checknumber() {
    }//��Ϊ���������ֱ��ͨ���������ã��ʲ���Ҫ���ݶ��󣬽�ʡ�ռ䣻

    public static String checkNumber_util(int i)
    {
        //��֤������
        String character="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOBPRSTUVWXYZ0123456789";
        String checkNumber="";
        Random r=new Random();
        for ( i = 0; i < 5; i++){
            int add=r.nextInt(character.length());
            char temp=character.charAt(add);
            checkNumber=checkNumber+temp;
        }
        return checkNumber;
    }

}
