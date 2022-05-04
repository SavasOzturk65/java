package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C10_SwichCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz.");
        int sayi = scan.nextInt();
switch (sayi){
    case 10 :
        System.out.println("en kücük iki basamakli sayi");
        break;
    case 100 :
        System.out.println("en kücük üç basamakli sayi");
        break;
    case 1000 :
        System.out.println("en kücük dört basamakli sayi");

        break;
    default:
        System.out.println("Lutfen geçerli bir sayı giriniz.");
        scan.close();
}
    }
}
