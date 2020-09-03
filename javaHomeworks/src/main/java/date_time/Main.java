package date_time;

import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;



/**
 * @author Evgeny Borisov
 */
public class Main {


    public static Date convert(LocalDate date) {
        // todo finish this
        return java.sql.Date.valueOf(date);
    }

    public static LocalDateTime convert(Date date) {
        // todo finish this
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }

    // 1981/02/30&18:20
    public static int daysBetween(String firstDate, String lastDate) {
        //JSR 310
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd&HH:mm");
        LocalDateTime date1 = LocalDateTime.parse(firstDate, formatter);
        LocalDateTime date2 = LocalDateTime.parse(lastDate, formatter);

        return (int) Duration.between(date1, date2).toDays();
    }



    public static void main(String[] args) {
        String firstDate = "1981/02/20&18:20";
        String lastDate = "1981/03/20&18:20";
        System.out.println(daysBetween(firstDate,lastDate));



//        LocalDateTime now1 = LocalDateTime.now();
//        System.out.println(convert(now1));
////        LocalDateTime.of(1932,12,12,12,12,12)
//        LocalDate now = LocalDate.now();
//        LocalDate yest = now.minusDays(1);
//        LocalDate date = now.withYear(2010);
//        String displayName = date.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
//        System.out.println("displayName = " + displayName);
//
////        Duration
//        long between = ChronoUnit.DAYS.between(date, now);
//        System.out.println("between = " + between);

//
//        String str = "java";
//        str = str.toUpperCase();
//
         Date date = new Date();
         System.out.println(convert(date));
//        System.out.println("date = " + date.getYear());
    }
}
