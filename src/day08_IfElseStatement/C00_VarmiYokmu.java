package day08_IfElseStatement;

import java.util.Scanner;

public class C00_VarmiYokmu {
    public static void main(String[] args) {
        /*String diller= "arapca , ingilizce ,fransizca , alamanca";

    if (diller.contains("arapca")){
    System.out.println("arapca biliyorsunuz");

}
    String cinsiyet = "Kadın";
            int yas=30;
            if (cinsiyet.equals("Erkek") && yas>=20) {
                System.out.println("Askere gidebilir.");
            } else {
                System.out.println("Askere gidemez");}
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz");
        String ad= scan.next();
        System.out.println("Lütfen sifrenizi giriniz.");
        String sifre=scan.next();
        if (ad.equals("admin") && sifre.equals("123456")){
            System.out.println("Hoş Geldiniz.");
        } if (!ad.equals("admin")){
            System.out.println("Adınızı yanlıs girdiniz.");
        } if (!sifre.equals("123456")){
            System.out.println("Şifrenizi yanlıs girdiniz.");
        }*/

      Scanner svs = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi=svs.nextDouble();
        if (sayi<=10)
        {
            System.out.println("sensin mürşit");

        }if (sayi>=10){
            System.out.println("ipraamin kel horuzu");
        }








    }
}
