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
            log.debug("main������ʼִ��");
            log.info("��¼�ڶ�����־");

            a = 10;
            b = 20;

            log.trace("a="+a);
            log.trace("b="+b);

            System.out.println(a*b);

        } catch (Exception e) {
            log.error("���ֳ�������");
            throw new RuntimeException(e);
        }




    }
}
