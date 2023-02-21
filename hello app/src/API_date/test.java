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



        //��ʽ��ʱ��
        SimpleDateFormat s=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss EEE a");
        String d=s.format(date);
        System.out.println(d);

        //����ʱ��

        String t="2022��10��03�� 22:09:12";
        SimpleDateFormat date1=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
        Date d1=date1.parse(t);
        System.out.println(d1);

        //�߹�һ��ʱ��������
        long time2= d1.getTime()+(2*24*60*60+14*60*60+49*60+6)*1000;//��λΪ����
        System.out.println(s.format(time2));


        //calender����
        Calendar c=Calendar.getInstance();
        System.out.println(c);

        //��ȡ
        int month=c.get(Calendar.MONTH);
        System.out.println(month);


        //�޸�
        c.set(Calendar.MONTH,5);

        //����
        c.add(Calendar.DAY_OF_WEEK,2);
        //



        ///////////////������������
        LocalDate D=LocalDate.now();
        D.getDayOfWeek();

        LocalDateTime T=LocalDateTime.now();//��Ϣ��ȫ
        T.minusDays(1);
        T.plusDays(2);//ԭʱ�䲻�䣬�������¶���


        MonthDay birthday=MonthDay.of(7,13);

        //isBefore,isAfter;//�Ƚ�localDate;




        /////////instantʱ���

        Instant I=Instant.now();
        I.atZone(ZoneId.systemDefault());//Ĭ��ʱ��
        System.out.println(I);



        ////period���ڼ���������գ�
        LocalDate birthday1=LocalDate.of(2002,7,13);
        LocalDate NOWDAY=LocalDate.now();

        Period P=Period.between(birthday1,NOWDAY);
        System.out.println(P);


        //durationʱ��



    }
}
