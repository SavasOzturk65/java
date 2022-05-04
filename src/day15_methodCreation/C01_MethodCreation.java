package day15_methodCreation;

import java.util.Scanner;

public class C01_MethodCreation {
    public static void main(String[] args) {
// kullanıcıdan ismini ve soyismini isteyin
        // İki farkli method olusturun
        // Methodlardan biri girilen kelimeleri ilk harfi büyük digerleri kücük olacak sekilde birlestirsin.
        //İkinci method ise girien kekimelrein ilk harfleri büyük,kalan harfleri * olacak şekilde birleştirsin.
        //Kullanıcıya isminin acik veya gizli olmasi tercihini sorun.
        // programin kalan kisminda ismi soy ismi kulanicinin istedigi sekilde kullanin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi ve soyisminizi giriniz\n isimden sonra entre basiniz.");
        String isim = scan.next();
        String soyIsim = scan.next();
        acikIsim( isim,soyIsim);
        gizliIsim(isim,soyIsim);

        System.out.println("İsminizin acik yazilmasini istiyorsanız 1, kapali yazilmasini istiyorsaniz 2 giriniz.");
        String birlesmisIsim = null;
        int tercih = scan.nextInt();
                if (tercih==1){
            birlesmisIsim = acikIsim(isim,soyIsim);
        } else if (tercih==2){
            birlesmisIsim = gizliIsim(isim,soyIsim);
        } else {
            System.out.println("Lütfen tercih olarak 1 veya 2 giriniz");
        }

        System.out.println("Tercihiniz: "+ birlesmisIsim);

    }
    public static String acikIsim(String isim,String soyIsim){
        isim=isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();
        soyIsim =soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).toLowerCase();
        return isim+" "+soyIsim;
    }  public static String gizliIsim(String isim,String soyIsim) {
        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
        soyIsim = soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1).replaceAll("\\w", "*");
        return isim+" "+soyIsim;

}
}
