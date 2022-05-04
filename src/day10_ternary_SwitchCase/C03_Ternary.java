package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz.");
        double sayi = scan.nextDouble();
        double mutlakdeger = sayi>=0 ? sayi : -1*(sayi);


        System.out.println(mutlakdeger);









    }
}
