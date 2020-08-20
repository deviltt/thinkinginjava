package com.java8InAction.chap12;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTimeExamples {
    private static final ThreadLocal<DateFormat> formatters =
            new ThreadLocal<DateFormat>() {
                @Override
                protected DateFormat initialValue() {
                    return new SimpleDateFormat("dd-MMM-yyyy");
                }
            };

    public static void main(String[] args) {
        useOldDate();
        useLocalDate();
        useDateFormatter();

        DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime localDateTime=LocalDateTime.parse("2020-08-20 14:46", dateTimeFormatter);
        System.out.println(localDateTime);
    }

    private static void useOldDate() {
        Date date = new Date(114, 2, 18);
        System.out.println(date);
        System.out.println(formatters.get().format(date));

        Calendar calendar = Calendar.getInstance();
        calendar.set(2014, Calendar.FEBRUARY, 18);
        System.out.println(calendar);
    }

    private static void useLocalDate() {
        LocalDate date = LocalDate.of(2012, 3, 18);
        int year = date.getYear();  //2014
        Month month = date.getMonth();  //月份 3月
        int day = date.getDayOfMonth();     //几号 18号
        DayOfWeek dow = date.getDayOfWeek();    //周几 Tuesday
        int len = date.lengthOfMonth(); //一个月有多少天
        boolean leap = date.isLeapYear();   //false 不是闰年
        System.out.println(date);

        int y = date.get(ChronoField.YEAR);
        int m = date.get(ChronoField.MONTH_OF_YEAR);
        int d = date.get(ChronoField.DAY_OF_MONTH);

        LocalTime time = LocalTime.of(13, 45, 20);
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        System.out.println(time);

        //初始化 年月日 时间 的方式，5种
        LocalDateTime dt1 = LocalDateTime.of(2014, Month.MARCH, 18, 13, 45, 20);
        LocalDateTime dt2 = LocalDateTime.of(date, time);
        LocalDateTime dt3 = date.atTime(13, 45, 20);
        LocalDateTime dt4 = date.atTime(time);
        LocalDateTime dt5 = time.atDate(date);
        System.out.println(dt1);

        LocalDate date1 = dt1.toLocalDate();
        System.out.println(date1);
        LocalTime time1 = dt1.toLocalTime();
        System.out.println(time1);

        Instant instant = Instant.ofEpochSecond(44 * 365 * 86400);  //2013-12-21T00:00:00Z
        Instant now = Instant.now();    //2020-08-20T08:31:27.606Z

        //arg2 - arg1 一共经历了多久
        Duration d1 = Duration.between(LocalTime.of(13, 45, 10), time);
        Duration d2 = Duration.between(instant, now);
        System.out.println(d1.getSeconds());
        System.out.println(d2.getSeconds());

        Duration threeMinutes = Duration.of(3, ChronoUnit.MINUTES);
        System.out.println(threeMinutes);   //PT3M
        System.out.println(threeMinutes.getSeconds());  //180

        JapaneseDate japaneseDate=JapaneseDate.from(date);
        System.out.println(japaneseDate);
    }

    private static void useDateFormatter(){
        LocalDate date=LocalDate.of(2014,3,18);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter italianFormatter=DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.ITALIAN);

        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(date.format(formatter));
        System.out.println(date.format(italianFormatter));
    }
}
