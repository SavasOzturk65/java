package day12_stringManipulations;

import java.util.Scanner;

public class C04_LastIndexOf {
    public static void main(String[] args) {
        // Soru 2) Kullanicidan bir cumle ve bir kelime isteyin,
        // 		olan cumledeki kullanna bakarak asagidaki 3 cumleden uyguni yazdirin
        //     	- Girilen kelime cumlede kullanılmamış.
        // 		- Girilen kelime cumlede 1 kere kullanılmış.
        // 		- Girilen kelime cumlede 1'den fazla kullanılmış.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz.");
        String cümle = scan.nextLine();
        System.out.println("Lütfen bir kelime giriniz.");
        String kelime = scan.next();

int ilkİndex = cümle.indexOf(kelime);
int sonİndex = cümle.lastIndexOf(kelime);

if (ilkİndex==-1
){
    System.out.println("Aradiginiz kelime cümlede kullanılmamıştır.");

} else if (ilkİndex==sonİndex){
    System.out.println("Aradiginiz kelime cümlede bir kez kullanılmıştır.");
} else {
    System.out.println("Aradiginiz kelime cümlede birden fazla kullanılmıştır.");
}



scan.close();




    }
}
