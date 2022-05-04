package day22_arrays;

import java.util.Arrays;

public class C01_BinarySearch {
    public static void main(String[] args) {


        String isimler[] = { "Hacer", "aynur", "Emine", "Murat", "Kutlu"};

        // isimler array'inde Murat ismi var mi ?

        // array'de arama yapmadan once siralama yapmaliyiz

        Arrays.sort(isimler);
        // arrayss class'i ile sort yaptigimizda array'imiz kalici olarak degisir

        System.out.println(Arrays.toString(isimler)); // [Emine, Hacer, Kutlu, Murat, aynur]
        // sort method'u elementleri natural order'a gore siralar

        isimler[4]="Aynur";
        System.out.println(Arrays.toString(isimler)); // [Emine, Hacer, Kutlu, Murat, Aynur]
        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));// [Aynur, Emine, Hacer, Kutlu, Murat]

        System.out.println(Arrays.binarySearch(isimler, "Murat")); // 4

        System.out.println(Arrays.binarySearch(isimler, "Mehmet")); // -5
        System.out.println(Arrays.binarySearch(isimler, "Tuba")); // -6
        System.out.println(Arrays.binarySearch(isimler, "Kursat")); // -4
    }
}
