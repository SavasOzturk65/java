package day17_forLoops;

import java.util.Scanner;

public class C04_Palindrome {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen tersten yazdirmak için bir yazi yaziniz.");
        String str = scan.nextLine();
        tersineCevir(str);
        if (str.equals(tersineCevir(str))){
            System.out.println("Girdiginiz yazi palidrome dur");
        } else {System.out.println("Girdiginiz yazi palidrome degildir");

        }


    }public static String tersineCevir(String str){
        String tersStr = "";
        for (int i = str.length()-1; i>=0;i--){
            tersStr+= str.substring(i,i+1);
        }

        return tersStr; }
}








