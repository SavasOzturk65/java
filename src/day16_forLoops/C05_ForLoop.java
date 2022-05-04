package day16_forLoops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 100 den küçük pozitir bir tam sayi giriniz ");
        double num = scan.nextDouble();
        int sayi = (int) num;


        if (num<0){
            System.out.println("Negatif sayi girmeyiniz.");
        }else if (sayi!=num){
            System.out.println("Lütfen pozitif tam sayi giriniz");
        }else if(num>100){
            System.out.println("100' den büyük sayi girmeyiniz.");}
        else {









        for (int i = 1; i<=num;i++){
            if (i%3==0){
                System.out.println(i+" ");
            }
        }}
    }
}
