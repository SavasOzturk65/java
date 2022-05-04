package day07_ifElseStatements;

import java.util.Scanner;
public class C06_Emeklilik {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();
if (yas>=65){
    System.out.println("Emekli olabilirsiniz.");}

 else
 {
    System.out.println("Emekli olamazsiniz.");
}


    }
}
