package Day05_matematikselişlemler;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {
    public static void main(String[] args) {
        // kullanıcıdan aldığımız 4 rakamlı bir sayının
        // rakamlar toplamını bulma 7532

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen 4 basamakli bir sayi giriniz :");
        int sayi= scan.nextInt();
        int rakam=0;
        int rakamlarToplami=0;
        //1.ADIM r=0, rt=0 sayı=7532


     rakam=sayi%10; //2
        rakamlarToplami +=rakam; //2
        sayi/=10;
       // 2/adim rakam=2, rt=2 sayi=753
        rakam=sayi%10;// 3
        sayi/=10;
        rakamlarToplami+=rakam;

        //3.adım
           // r=3,rt=5 sayi=75
        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;
        //4.adım
        //r=5, rt=10 sayi=7
        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami+=rakam;
        System.out.println("girdiginiz sayinin rakamlar taplami:"+rakamlarToplami);











    }
}
