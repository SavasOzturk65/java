package day31_dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {
    public static void main(String[] args) {
        LocalTime saat =LocalTime.now();
        System.out.println("Baslangic saati : "+saat);
        int sayi = 10;
        for (int i=0;i<1000;i++){
            sayi++;
        }
        LocalTime saatbitis = LocalTime.now();
        System.out.println("Bitis saati : "+ saatbitis);
       // Eger bir islemin baslangic ve bitis zamanini kaydetmek istiyorsak
        // Hem basinda , hem de sonunda LocalTime objesi olusturmaliyiz
        double nano1 = saat.getNano();
        double nanobitis= saatbitis.getNano();
        System.out.println("For Loop Çalışma Süresi : " +(nanobitis-nano1)+ " nano saniye");
        System.out.println(saat.getMinute());
        System.out.println(saat.plusMinutes(1000));
        System.out.println(saat.minusMinutes(1000));
        LocalTime yerelSaat= LocalTime.now(ZoneId.of("Turkey"));
        System.out.println(yerelSaat);
    }
}
