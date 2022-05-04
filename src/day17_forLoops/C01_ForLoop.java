package day17_forLoops;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 100'den küçük pozitif bir tam sayi giriniz.");
int num =scan.nextInt();
for (int i= 1; i<=num; i++){

if (i%3==0&&i%5==0){
            System.out.println("Java Güzeldir");
        } else if (i%3==0){
            System.out.println("Java");
        } else if (i%5==0){
            System.out.println("Güzeldir");
        } else {
            System.out.println(i);
        }
{scan.close();

}

    }}}

