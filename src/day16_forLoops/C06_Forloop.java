package day16_forLoops;

import java.util.Scanner;

public class C06_Forloop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 100'den küçük pozitif birtam sayi giriniz.");
        int num = scan.nextInt();
        for (int i=1; i<=num;i++){
            if(i%3==0 || i%5==0){
                System.out.print(i+" ");
            }scan.close();
        }
    }
}
