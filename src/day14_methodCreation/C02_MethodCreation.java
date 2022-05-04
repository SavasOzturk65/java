package day14_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz\nentere basip ikinci sayiyi giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        System.out.println("girilen sayilarin kareler toplamını istiyorsanız 2\n" +
                "küpler toplamini istiyorsanız 3 giriniz.");
        int secim = scan.nextInt();
        switch (secim){
            case 2 :
                karelerintoplami(sayi1,sayi2);
                break;
            case 3 :
                küplerintoplami(sayi1,sayi2);
            default:
                System.out.println("Lütfen gecerli tercih yapiniz.");
        }
scan.close();
    }
    public static void karelerintoplami( double sayi1, double sayi2)

       {
           double karelerintoplami = sayi1*sayi1+sayi2*sayi2;
        System.out.println("karelerin toplami :"+ karelerintoplami);
    }
    public static void küplerintoplami( double sayi1, double sayi2){
    double küplerintoplami= sayi1*sayi1*sayi1+sayi2*sayi2*sayi2;
    System.out.println("küplerin toplami :"+ küplerintoplami);}
}
