package day08_IfElseStatement;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class C06_IfElseIfOrnek6 {
    public static void main(String[] args) {


        Scanner scan =new Scanner(System.in);
        System.out.println("Maaş Teklifiniz:");
      double teklif=scan.nextDouble();
      if (teklif<60000){
          System.out.println("Kabul etmiyorum");
      } if (teklif>60000 && teklif<80000){
            System.out.println("Düşünmem gerek");
        } if (teklif>80000){
            System.out.println("kabul ediyorum.");
        }













    }








}
