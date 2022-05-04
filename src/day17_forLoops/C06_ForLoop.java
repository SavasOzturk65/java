package day17_forLoops;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 10'dan küçük bir tam sayi giriniz.");
        int sayi = scan.nextInt();
        System.out.print(sayi+"! = ");
        int faktoryel = 1;
        for (int i= sayi;i>1;i--){
            faktoryel*=i;
            System.out.print(i+"*");
        }
        System.out.print("1= "+faktoryel);
        scan.close();
    }
}
