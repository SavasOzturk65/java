package day09_nestedIfElse;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        int x=10;
        String tekmiciftmi = x%2==0 ? "Cift sayi" :"Tek sayi";


        System.out.println(tekmiciftmi);

        System.out.println(x>=5? "aferin":4);
        int y=1 ;
        int z= 2;
        int a = y<10 ? y++ : z++;

        System.out.println( y+ ","+z+","+a);

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz\n enter e basınız bir sayı daha giriniz.");
int sayi1 =scan.nextInt();
int sayi2 = scan.nextInt();
        System.out.println(sayi1<sayi2 ? sayi2:sayi1);
        System.out.println("lütfen 3.sayıyı giriniz.");

        int sayi3 = scan.nextInt();
        System.out.println(sayi3%2==0 ? "Çift sayi" : "Tek sayi"
        );

        





}}

