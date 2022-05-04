package day10_ternary_SwitchCase;

import java.util.Locale;

public class C13_TouUpperCaseLowerCase {
    public static void main(String[] args) {
//tum karakterleri büyük harfe veya kiçik harfe çevirir.
String isim = "alI" ;

        System.out.println(""+isim.toUpperCase().charAt(0)+isim.toLowerCase().charAt(1)+isim.toLowerCase().charAt(2));

        System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr")

        ));






    }
}
