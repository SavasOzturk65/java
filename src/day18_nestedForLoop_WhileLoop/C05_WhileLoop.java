package day18_nestedForLoop_WhileLoop;

public class C05_WhileLoop {
    public static void main(String[] args) {
// Soru 2 ) For loop ve while Loop kullanarak 3 basamakli sayilardan
        //          15, 20 ve 90’na tam bolunebilen sayilari yazdirin.

        for (int i = 100; i <= 999; i++) {
            if (i % 15 == 0 && i % 20 == 00 && i % 90 == 0) {
                System.out.print(i + " ");

            }

        }System.out.println(" ");
        int i = 100;
        while (i < 1000) {
        if (i % 15 == 0 && i % 20 == 00 && i % 90 == 0) {

            System.out.print(i+" ");



        }  i++;
    }}}// Eger baslangic ve bitis sarti bir sayinin artisina bagli ise veya
// tekrar edilecek islem adedi belli ise for loop tercih edilir
// islem tekrar sayisi belli degilse veya
// bitis icin bir sinir degerinden buyuk olma gibi bir sart varsa while loop tercih edilir
