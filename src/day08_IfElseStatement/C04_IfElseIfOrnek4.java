package day08_IfElseStatement;

import java.util.Scanner;

public class C04_IfElseIfOrnek4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz\nilk sayıdan sonra diger sayi icin enter e basiniz.");

        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        if (sayi1>0 && sayi2>0){
            System.out.println("sayilarin  toplami:"+(sayi1+sayi2));}
            else if (sayi1<0  &&   sayi2<0){
                System.out.println("Sayilerin carpimi:" +sayi1*sayi2);
            } else if (sayi1*sayi2<0){
            System.out.println("Farkli isarete sahip sayilarla işlem yapamazsiniz.");
        }
else {
            System.out.println("0 Carpma isleminde yutan elemandır.");
        }

        }
    }

