package Log;

import exceptions.main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class demo {
    public static final Logger log = LoggerFactory.getLogger("demo.class");
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        try {
            log.debug("main方法开始执行");
            log.info("记录第二行日志");

            a = 10;
            b = 20;

            log.trace("a="+a);
            log.trace("b="+b);

            System.out.println(a*b);

        } catch (Exception e) {
            log.error("出现除法错误");
            throw new RuntimeException(e);
        }




    }
}
