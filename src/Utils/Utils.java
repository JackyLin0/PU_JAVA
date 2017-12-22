package Utils;

import java.util.Calendar;
import java.util.Date;

public class Utils {
     public static final String [] week = new String[]{"日","一","二","三","四","五","六"};
    public static final String ymd ="yyyy/MM/dd";
    public static final String md ="MM/dd";
    public static final String d = "dd";

    public static boolean isSameDate(Date date1,Date date2)
    {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(date1);
        c2.setTime(date2);
        return isSameDate(c1,c2);
    }

    public static boolean isSameDate(Calendar c1,Calendar c2)
    {
        return  c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR)
                &&c1.get(Calendar.MONTH) == (c2.get(Calendar.MONTH))
                &&c1.get(Calendar.DAY_OF_MONTH) == c2.get(Calendar.DAY_OF_MONTH);
    }
}
