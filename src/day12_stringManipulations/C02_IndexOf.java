package day12_stringManipulations;

import java.util.Scanner;

public class C02_IndexOf {
    public static void main(String[] args) {
        // Soru 2) Kullanicidan bir cumle ve bir kelime isteyin,
                //		kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
                //    	- Girilen kelime cumlede kullanilmamis.
                //		- Girilen kelime cumlede 1 kere kullanilmis.
                //		- Girilen kelime cumlede 1’den fazla kullanilmis.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz.");
        String cümle = scan.nextLine();
        System.out.println("Lütfen bir kelime giriniz.");
        String kelime = scan.next();
int index = cümle.indexOf(kelime);
if (index<0){
    System.out.println("Aradığınız kelime cümlede yoktur.");
}else  if(cümle.indexOf(kelime,index+1)<0) {
    System.out.println("Aradıgınız kelime cümlede bir kere kullanılmıştır.");
}
else {
    System.out.println("Aradiginiz kelime cümlede birden fazla kullanılmıştır.");
}
scan.close();







    }
}
