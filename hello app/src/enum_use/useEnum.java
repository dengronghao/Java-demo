package enum_use;
//枚举
public  enum useEnum {
        spring,summer,winter,fall;
    }
    //继承了枚举类型：java.lang.Enum;
    /*相当于
    public final season extends java.lang.enum<season>{
    public static final season spring=new season();
    ..........................
    public static season[]values();
    public static season valueOf(java.lang.String);
     */

