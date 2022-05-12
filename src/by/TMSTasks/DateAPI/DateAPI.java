package by.TMSTasks.DateAPI;

import java.time.*;

public class DateAPI {
    public static void main(String[] args) {
    dateNow();
    dateTimeNow();
    dateOf();
    epochDay();
    yearDay();
    timeOf();
    localTime();
    secondsOf();
    dateTimeOf();
    dateOfEpoch();
    }
    public static void dateNow(){
        LocalDate today = LocalDate.now();
        System.out.println("1." + today);
    }

    public static void dateTimeNow(){
        LocalDateTime today = LocalDateTime.now();
        System.out.println("2." + today);
    }
    public static void dateOf(){
        LocalDate dateOf = LocalDate.of(1999, Month.FEBRUARY,17);
        System.out.println("3." + dateOf);
    }
    public static void epochDay(){
        LocalDate epoch = LocalDate.ofEpochDay(1900);
        System.out.println("4." + epoch);
    }
    public static void yearDay(){
        LocalDate yearday = LocalDate.ofYearDay(1999,48);
        System.out.println("5." + yearday);
    }
    public static void timeOf(){
        LocalTime timeOf = LocalTime.of(10,15,20,500000100);
        System.out.println("6." + timeOf);
    }
    public static void localTime(){
        LocalTime localTime = LocalTime.now();
        System.out.println("7." + localTime);
    }
    public static void secondsOf(){
        LocalTime seconds = LocalTime.ofSecondOfDay(36000);
        System.out.println("8."+seconds);
    }
    public static void dateTimeOf(){
        LocalDateTime date = LocalDateTime.of(LocalDate.now(),LocalTime.now());
        System.out.println("9." + date);
    }
    public static void dateOfEpoch(){
        LocalDateTime dateTime = LocalDateTime.ofEpochSecond(2653,0, ZoneOffset.UTC);
        System.out.println(dateTime);
    }
}
