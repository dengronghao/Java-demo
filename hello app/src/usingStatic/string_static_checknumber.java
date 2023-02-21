package usingStatic;

import java.util.Random;

public  class string_static_checknumber {
//若代码经常被使用，则可以写成工具类，用static类定义，直接使用类名来调用

    private string_static_checknumber() {
    }//因为工具类可以直接通过类名调用，故不需要创捷对象，节省空间；

    public static String checkNumber_util(int i)
    {
        //验证码生成
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
