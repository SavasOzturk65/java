package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz.");

        double sayi1 = scan.nextDouble();
        System.out.println("Lutfen bir daha sayi giriniz.");
        double sayi2 = scan.nextDouble();

        System.out.println(sayi2>sayi1 ? sayi1: sayi2);

scan.close();
    }
}
