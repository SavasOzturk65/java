package day31_dateAndTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {
    public static void main(String[] args) {
        LocalDate tarih = LocalDate.now();
        System.out.println(tarih);//2022-03-28
        System.out.println(tarih.getDayOfYear());//87.gün
        System.out.println(tarih.getDayOfMonth());//ayın 28.günü
        System.out.println(tarih.getDayOfWeek());
        System.out.println(tarih.getMonthValue());
        System.out.println(tarih.getMonth());


        System.out.println(tarih.plusDays(20));
        System.out.println(tarih.plusMonths(5));
        System.out.println(tarih.plusWeeks(15));
        System.out.println(tarih.plusYears(5));
        System.out.println(tarih.plusYears(10).plusMonths(10).plusDays(10));


        System.out.println(tarih.minusDays(10));
        System.out.println(tarih.minusWeeks(10));
        System.out.println(tarih.minusYears(5).plusMonths(5).minusDays(5));

        System.out.println(tarih.minusYears(20).isLeapYear());


        LocalDate dogumTarihi1= LocalDate.of(2000, Month.APRIL,12);
        LocalDate dogumTarihi2 = LocalDate.of(2020,02,02);
        LocalDate dogumtarihi3 = LocalDate.ofYearDay(2000,150);
        System.out.println(dogumTarihi1+" "+dogumTarihi2);
        System.out.println(dogumTarihi1.isAfter(dogumTarihi2));//false
        System.out.println(dogumtarihi3.isBefore(dogumTarihi1));

    }
}
