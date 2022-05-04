package day18_nestedForLoop_WhileLoop;

import java.util.Scanner;

public class C04_WhilwLoop {
    public static void main(String[] args) {
        // kullanicidan toplanmak uzere sayi isteyin
        // kullanici sifira basincaya kadar sayilari alip
        // toplamaya devap edin
        // kullanici sifira bastiginda,
        // o ana kadar sifir haric kac sayi girdigini ve girilen sayilarin toplamini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println();
        // loop'un icinde kullanacagim obje ve variable'lari
        // loop'dan once olusturmak daha guzeldir
        // cunku loop'un icinde olusturursak,
        // loop her dondugunde yeni bir obje veya variable olusturur ve bu da hafizayi doldurur
         // loop'un icinde kullanacagim obje ve variable'lari
        // loop'dan once olusturmak daha guzeldir
        // cunku loop'un icinde olusturursak,
        // loop her dondugunde yeni bir obje veya variable olusturur ve bu da hafizayi doldurur
        int sayi=33; // 0'in disinda ne yazarsak olur
        int toplam=0;
        int sayac=0;
while(sayi!=0){
    System.out.println("Lutfen toplama eklemek icin bir tamsayi yazin \nbitirmek icin 0'a basin");
    sayi= scan.nextInt();
    toplam+=sayi;
    sayac++;
    System.out.println("Girilen sayilarin toplami. "+toplam);
    System.out.println("Girilen sayi adedi. "+(sayac-1));
    scan.close();
}
    }
}
