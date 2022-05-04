package day15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {

/*kullanıcıya kac sayi toplamak istedigini sorun
kullanici 2, 3 veya 4 degerini girerse
kullanicidan bu sayilari girmesini isteyiniz ve toplamlarini yazdirin
kullanici toplamak istedigi sayi adadini 4 den büyük girerse
"Cok sayi girdiniz.Toplayamam"yazdirin.
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kac sayi toplamak istediginizi girin.");
        int tercih = scan.nextInt();
        if (tercih > 5) {
            tercih = 5;
        }
        switch (tercih) {
            case 2:
                ikiSayiTopla();
                break;
            case 3 :
                ucSayiTopla();
                break;
            case 4:
                dortSayiTopla();
                break;
            case 5:
                System.out.println("Cok sayi girdiniz.Toplayamam");
                break;
            default:
                System.out.println("hatali tercih");

        }
    } public static void ikiSayiTopla(){
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen iki sayi girininiz.\nher sayidan sonra enter basiniz .");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();


        System.out.println("iki sayi toplami : "+ (sayi1+sayi2));
        scan.close();
    }public static void ucSayiTopla(){
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen üc sayi giriniz.\nher sayidan sonra enter basiniz .");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        double sayi3 = scan.nextDouble();

        System.out.println("üç sayi taoplami : "+ (sayi1+sayi2+sayi3));

scan.close();

}public static void dortSayiTopla(){
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen dört sayi giriniz.\nher sayidan sonra enter basiniz .");
        double sayi1=  scan.nextDouble();
        double sayi2 = scan.nextDouble();
        double sayi3 = scan.nextDouble();
        double sayi4 = scan.nextDouble();
        System.out.println("dört sayi toplami : "+ (sayi1+sayi2+sayi3+sayi4));
        scan.close();
    }
}
