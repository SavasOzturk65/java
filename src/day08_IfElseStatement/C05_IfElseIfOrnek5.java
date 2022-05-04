package day08_IfElseStatement;

import java.util.Scanner;

public class C05_IfElseIfOrnek5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 100 lük sisteme göre notunuzu giriniz.");
        double not=scan.nextDouble();
        if (not<0||not>100) {
            System.out.println("lütfen gecerli bir not(0<=not>=100) giriniz.");
        } else
        if (not<50){
            System.out.println("Notunuz: D");
        }else if (not<60){

            System.out.println("Notunuz : C");

        } else if (not<80){
            System.out.println("Notunuz : B");
        } else {
            System.out.println("Notunuz : A");
        }
    }
}
