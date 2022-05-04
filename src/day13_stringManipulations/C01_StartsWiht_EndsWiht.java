package day13_stringManipulations;

import java.util.Scanner;

public class C01_StartsWiht_EndsWiht {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir kelime alin
        // verilen cumlenin verilen kelime(char squence) ile baslayip, baslamadigini
        // ve bitip bitmedigini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cümle giriniz.");
String cümle = scan.nextLine();
        System.out.println("lütfen bir kelime giriniz.");
        String kelime = scan.next();

        if (cümle.startsWith(kelime)){
            System.out.println("cümle "+ kelime+ " ile başlıyor");
        }else {
            System.out.println("cümle " + kelime + " ile başlamiyor");

        }
if (cümle.endsWith(kelime)){
    System.out.println("cümle " + kelime + " ile bitiyor");
} else {
    System.out.println("cümle " + kelime + " ile bitmiyor.");
}

scan.close();





    }
}
