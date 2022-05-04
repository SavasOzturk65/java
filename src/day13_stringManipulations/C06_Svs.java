package day13_stringManipulations;

import java.util.Locale;
import java.util.Scanner;

public class C06_Svs {
    public static void main(String[] args) {
        // Şifre sorusu
        //kullanıcıda ismini,soyismini ve kk numarasını isteyin ve şu şekilde yazdırın.
        //isim soyisim : M********* B************
        // Kart No :**** **** **** 1234
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz\n" +
                "entere basıp soy isminizi giriniz.");
        String isim = scan.next();
        String soyisim = scan.next();
        System.out.println("lütfen kredi kartı numaranızı giriniz.");
        String kkNo =scan.next();

        String isimFormati = isim.substring(0,1).toUpperCase()+ isim.substring(1).replaceAll("\\w","*");

         String soyIsimFormati = soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");
        System.out.println("İsim Soyisim: "+isimFormati+" "+soyIsimFormati);
        String kknoformati = "**** **** **** "+kkNo.substring(13);
        System.out.println("kk no: "+kknoformati);
    }
}
