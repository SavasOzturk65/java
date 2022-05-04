package day09_nestedIfElse;

import java.util.Scanner;

public class C02_NestedIfElseIf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı bir sayı giriniz");
        int sayi =scan.nextInt();

        if (sayi<1000 || sayi>9999){
            System.out.println(" pozitif 4 basamaklı bir sayı girmelisiniz.");}
            else {
                if (sayi%5==0){
                    if (sayi%10==0){
                        System.out.println("sayı  5 e bölünen çift sayıdır.");
                    } else {
                        System.out.println("Sayı 5 e bölünen tek sayıdır.");}
                }  else {
                    System.out.println("Tekrar deneyin.");

                }
            }

           }}

