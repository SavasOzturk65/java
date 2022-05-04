package day17_forLoops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen aradaki tüm sayilari toplamak için iki sayi giriniz.");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
int kucuk =0;
int buyuk =0;
if (sayi1>sayi1){
    buyuk = sayi1;
    kucuk = sayi2;
} else {
    buyuk = sayi2;
    kucuk = sayi1;

}
int toplam = 0;
for (int i = kucuk; i<= buyuk; i++){
    toplam+=i;
}
        System.out.println("Girilen iki sayi veralarindaki sayilarin toplami : "+toplam);
scan.close();
    }
}
