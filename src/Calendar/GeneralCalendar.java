package Calendar;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import static Utils.Utils.*;
public class GeneralCalendar {
    static int [] days_of_month = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
            Calendar c1 =  Calendar.getInstance();
            int year =  c1.get(Calendar.YEAR);
            int month =  c1.get(Calendar.MONTH);
            int date =  c1.get(Calendar.DATE);
            System.out.println("請輸入年" );
            Scanner scanner = new Scanner(System.in);
            year = scanner.nextInt();
            System.out.println("請輸入月" );
            month = scanner.nextInt();

        if(month == 12)
            {
               // year = year+1;
                month = month -1;
            }else{
            month = month-1;
        }
            c1.set(year,month,01);
        System.out.println(c1.getTime());
            Date date1 =c1.getTime();
            Calendar c2 = Calendar.getInstance();

            c2.set(1752,9,1);
            Date date3 = c2.getTime(),date2 = c2.getTime();
            int i=-1; //兩日期時間差

            do {
                c2.add(Calendar.DATE,1);
                date2 = c2.getTime();
                i++;
            }while(!isSameDate(date1,date2));

        System.out.println(i);
        System.out.println((date1.getTime()-date3.getTime())/(24*3600*1000));
        if(isleapYear(year))
        {
            System.out.println("true");
            days_of_month[1]=29;
        }

        int weekindex = i%7+1; //開頭是星期日
        System.out.println(weekindex);
        //int weekindex = i%7; //開頭是星期一
        for (String s: week)
        { System.out.print(s+"\t\t"); }

        System.out.println();
        if (weekindex !=7)
        for (int j = 0; j < weekindex; j++) {
                System.out.print("\t\t");  }


        int days = days_of_month[month];
            for(int j = 1;j<=days;j++)
            {
                System.out.print(j+"\t\t");
                if((weekindex+j)%7==0)
                 System.out.println();
            }
    }


    public static boolean isleapYear(int year) {
        boolean isLeap = false;
        if (year%4==0)
        {
            if(year%100==0)
            {
                if(year%400 == 0)
                {
                    isLeap = true;
                }else{
                isLeap = false;}
            }else {
                isLeap = true;
            }

        }else
        {
            isLeap = false;
        }
         return isLeap;
    }
}
