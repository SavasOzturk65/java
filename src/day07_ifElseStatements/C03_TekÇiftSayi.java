package day07_ifElseStatements;

import java.util.Scanner;

public class C03_TekÇiftSayi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir tam sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("sayibir çift sayidir.");
        }
        if (sayi%2!=0){
            System.out.println("sayi bir tek sayidir."); }
        // if-else
        if (sayi==0) {
            System.out.println("sayi çift sayisir.");} else
            {System.out.println("sayi tek sayidir.");}

scan.close();


        }
    }




