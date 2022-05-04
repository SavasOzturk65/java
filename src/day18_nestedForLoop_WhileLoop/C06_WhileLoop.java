package day18_nestedForLoop_WhileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
        // Kullanicidan toplanmak uzere sayilar isteyin
        // sayi adedi 10'u gecerse veya toplam 500'u gecerse
        // "Bu kadar sayi yeter"
        // ".. adet sayi girdin, toplami ..." yazdirin
        Scanner scan = new Scanner(System.in);
        int sayi=0; // 0'in disinda ne yazarsak olur
        int toplam=0;
        int sayac=0;
        while (toplam<500 && sayac<0){
            System.out.println("Lütfen toplama eklemek için bir sayi giriniz.");
            sayi =scan.nextInt();
            toplam+=sayi;
            sayac++;

        }System.out.println("Bu kadar sayi yeter");
        System.out.println(sayac + " adet sayi girdin, toplami: " + toplam);

    }
}
