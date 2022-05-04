package day29_staticBlock_passByValeu;

import java.util.Arrays;

public class C05_PassByValueArray {
    public static void main(String[] args) {
        int[] sayilar= {2,3,4,5,6,};
        elemanDegistir(sayilar);
        System.out.println("eleman degistir methodundan sonra  " + Arrays.toString(sayilar));
        arrayiDegistir(sayilar);
        System.out.println("arrayi degistir metodundan sonra : " +Arrays.toString(sayilar));
    }

    private static void arrayiDegistir(int[] sayilar) {
        sayilar = new int[6];
        System.out.println("arrayi degistir metodunda : " +Arrays.toString(sayilar));
    }

    private static void elemanDegistir(int[] sayilar) {
        sayilar[0]=10;
        System.out.println("eleman degistir methodunda " + Arrays.toString(sayilar));
    }
}
