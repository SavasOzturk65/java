package day08_IfElseStatement;

import java.util.Scanner;

public class C03_IfElseOrnek3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 1.Kenarın uzunlugunu giriniz");
        double kenar1 =scan.nextDouble();
        System.out.println("lütfen 2.Kenarın uzunlugunu giriniz");
        double kenar2 =scan.nextDouble();
        System.out.println("lütfen 3.Kenarın uzunlugunu giriniz");
        double kenar3 =scan.nextDouble();
        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Ucgeniniz eskenar ücgen dir");}
                else {
            System.out.println("Ucgeniniz eskenar ücgen degildir.");}
        }


    }

