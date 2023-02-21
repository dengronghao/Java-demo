package exceptions;

import java.text.SimpleDateFormat;
import java.util.Date;

public class try_catch {
    public static void main(String[] args) {

        System.out.println("program start");
        try {
            parseTime("2022-11-15 13:23:12");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void parseTime(String time) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(time);
        System.out.println(d);


    }
}
