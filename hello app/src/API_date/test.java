package API_date;

import jdk.swing.interop.SwingInterOpUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;

public class test {
    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        System.out.println(date);

        long time= date.getTime();
        time=System.currentTimeMillis();



        //格式化时间
        SimpleDateFormat s=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        String d=s.format(date);
        System.out.println(d);

        //解析时间

        String t="2022年10月03日 22:09:12";
        SimpleDateFormat date1=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d1=date1.parse(t);
        System.out.println(d1);

        //走过一段时间后的日期
        long time2= d1.getTime()+(2*24*60*60+14*60*60+49*60+6)*1000;//单位为毫秒
        System.out.println(s.format(time2));


        //calender日历
        Calendar c=Calendar.getInstance();
        System.out.println(c);

        //获取
        int month=c.get(Calendar.MONTH);
        System.out.println(month);


        //修改
        c.set(Calendar.MONTH,5);

        //增加
        c.add(Calendar.DAY_OF_WEEK,2);
        //



        ///////////////新增的日期类
        LocalDate D=LocalDate.now();
        D.getDayOfWeek();

        LocalDateTime T=LocalDateTime.now();//信息最全
        T.minusDays(1);
        T.plusDays(2);//原时间不变，创建了新对象；


        MonthDay birthday=MonthDay.of(7,13);

        //isBefore,isAfter;//比较localDate;




        /////////instant时间戳

        Instant I=Instant.now();
        I.atZone(ZoneId.systemDefault());//默认时区
        System.out.println(I);



        ////period日期间隔；年月日；
        LocalDate birthday1=LocalDate.of(2002,7,13);
        LocalDate NOWDAY=LocalDate.now();

        Period P=Period.between(birthday1,NOWDAY);
        System.out.println(P);


        //duration时间差；



    }
}
