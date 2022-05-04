package day08_IfElseStatement;

import java.util.Scanner;

public class C01_IfElse {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dikdörtgenin bir kenar uzunlugunu giriniz.");
        double kenar1=scan.nextDouble();
        System.out.println("Lutfen dikdörgenin diger kenar uzunlugunu giriniz.");
        double kenar2=scan.nextDouble();

        if (kenar1==kenar2){
            System.out.println("Dikdörtgeniniz ayrıca karedir.");}
            else {
                System.out.println("Dikdörtgeniniz kare degildir.");
            }
        }










    }


