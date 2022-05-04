package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz.");
        double sayi = scan.nextDouble();
        double sayi2= sayi*sayi;

        System.out.println(sayi>0 ? sayi : sayi2);














    }
}
