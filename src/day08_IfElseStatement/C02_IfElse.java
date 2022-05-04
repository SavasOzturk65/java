package day08_IfElseStatement;

import java.util.Scanner;

public class C02_IfElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        {
            System.out.println("lutfen bir karekter giriniz");
            char karakter=scan.next().charAt(0);
            if ((karakter>='A'&&karakter<='Z')||(karakter>='a'&&karakter<='z'))
            {
                System.out.println("Girdiginiz karakter; "+ karakter + " , bir harf tir." );}
                else {
                System.out.println("Girdiginiz karakter; "+ karakter + " , bir harf degildir.");}
            }
            }










    }

