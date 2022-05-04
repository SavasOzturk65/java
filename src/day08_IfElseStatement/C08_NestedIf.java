package day08_IfElseStatement;

import java.util.Locale;
import java.util.Scanner;

public class C08_NestedIf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz\nerkek icin E, kadin icin K");
char cinsiyet= scan.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yaşınızı giriniz:");
        double yas= scan.nextDouble();
        if (cinsiyet=='E'){
            if (yas>=65){
                System.out.println("Emekli Olabilirsiniz.");
            } else {System.out.println("Emekli olamazsınız.");}}
                else  if (cinsiyet=='K'){
            if (yas>=60){
                System.out.println("Emekli olabilirsiniz.");}
            else {
                System.out.println("Emekli olamazsınız.");
            }
        }}







    }
