package API_BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

//解决精度失真
public class test {
    public static void main(String[] args) {

        double a=1.25475;
        double b=4.547;
        BigDecimal a1=BigDecimal.valueOf(a);
        BigDecimal b1=BigDecimal.valueOf(b);
        BigDecimal c=a1.add(b1);
        System.out.println(c);


        double e=10.0;
        double d=3.0;
        BigDecimal e1=BigDecimal.valueOf(e);
        BigDecimal d1=BigDecimal.valueOf(d);
        BigDecimal f=e1.divide(d1,2, RoundingMode.HALF_DOWN);
        System.out.println(f);



    }
}
