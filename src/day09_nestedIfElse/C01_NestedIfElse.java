package day09_nestedIfElse;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz: ");
        char ilkkarakter=scan.next().charAt(0);
        if (ilkkarakter>='A' && ilkkarakter<='Z'){
            if (ilkkarakter=='A'){
            System.out.println("Geçerli şifre");} else {
                    System.out.println("Lütfen geçerli bir şifre giriniz.");}
        }  else if (ilkkarakter<='a' && ilkkarakter>='z'){
            if (ilkkarakter=='z'){
                System.out.println("Geçerli şifre");
        }  else {
                System.out.println("Lütfen geçerli bir şifre giriniz.");}}}}















