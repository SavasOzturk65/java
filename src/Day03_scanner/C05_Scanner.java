package Day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricapini giriniz");
        double yaricap= scan.nextDouble();
        System.out.println("Girdiginiz yarıcap"+ yaricap);
        System.out.println("cemberin cevresi :"+2*3.14*yaricap);
        System.out.println("Dairenin alanı  : " +3.14*yaricap*yaricap);







    }

}
