package day31_dateAndTime;

import java.time.LocalTime;

public class C04_DateTime {
    public static void main(String[] args) {
        // bir String ve bir int variable olusturalim
        // bir loop cerisinde bu variable'lari 1000 kere degistirelim
        // ve islem surelerini kiyaslayalim ?
        LocalTime saat =LocalTime.now();
        System.out.println("Baslangic saati : "+saat);
        int sayi = 10;
        for (int i=0;i<1000;i++){
            sayi++;
        }
        LocalTime saatbitis = LocalTime.now();
        System.out.println("Bitis saati : "+ saatbitis);

        double nano1 = saat.getNano();
        double nanobitis= saatbitis.getNano();
        System.out.println("int For Loop Çalışma Süresi : " +(nanobitis-nano1)+ " nano saniye");
        LocalTime saatS =LocalTime.now();
        System.out.println("Baslangic saati : " +saatS );
        String str = "celil";
        for (int i=0;i<1000;i++){
            str+= " ";
        }
        LocalTime saatbitisS = LocalTime.now();
        System.out.println("Bitis saati : "+ saatbitisS);

        double nano1S = saatS.getNano();
        double nanobitisS= saatbitisS.getNano();
        System.out.println("String  For Loop Çalışma Süresi : " +(nanobitisS-nano1S)+ " nano saniye");

        double strBitis=nanobitisS-nano1S;
        double intbitis= nanobitis-nano1;
        System.out.println("İnt str den : "+(intbitis-strBitis)+ "  nano saniye daha hızlı bitti");

    }
}
