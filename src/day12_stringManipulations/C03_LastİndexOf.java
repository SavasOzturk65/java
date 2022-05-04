package day12_stringManipulations;

import java.util.Scanner;

public class C03_LastİndexOf {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir harf isteyin,
        // harfin cumlede var olup olmadigini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cümle = scan.nextLine();
        System.out.println("Lütfen varligini kontrol etmek icin bir harf giriniz.");
        char krk = scan.next().charAt(0) ;

 int index = cümle.indexOf(krk);
 if (index==-1){
     System.out.println("Harf cümlede kullanılmamış.");
 }else{     System.out.println("Harf cümlede kullanılmış.");
 }
scan.close();











    }
}
