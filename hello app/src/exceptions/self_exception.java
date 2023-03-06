package exceptions;
//自定义编译时异常，继承exception
//运行时异常，RuntimeException
//
public class self_exception extends Exception{
    public self_exception() {
    }

    public self_exception(String message) {
        super(message);
    }
}
