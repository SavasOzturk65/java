package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        // Soru 5) Kullanicidan bir cumle isteyin ve
        //          cumledeki kelime sayisini yazdirin
String cumle = "Her sey, Javayla kolay";
String kelimeler[] = cumle.split(" ");
        System.out.println(Arrays.toString(kelimeler));//[Her, sey,, Javayla, kolay]
        System.out.println("Girilen cümlede "+kelimeler.length+" kelime vardir.");

    }
}
