package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C02_MDArrays {
    public static void main(String[] args) {// MultiDimensional Array'ler ic ice konulmus array'ler demektir
        // Array olusturmak icin iki yontemimiz vardi
        // 1.yontem bir kez ilan edip sonra değer atama
int arr[][] = new int[3][2]; // outer array (dış dizi)'i 3 elemanlı
        // onun bir inner array (iç dizisi) ise 2 elemanlı olan MDArray olusturur
        // Bu yontemle olusturdugumuzda inner array (iç dizi)'lerin hepsi aynı oboyutta olmalı
        System.out.println(Arrays.toString(arr)); //direk outer array (dış dizi)'i yazdırmak istedigimizde
        // içindeki elemanlar non primitive (ilkel olmayan) olduklarından
        // referansları yazdırılır
        //[[I@511baa65, [I@340f438e, [I@30c7da1e]
        System.out.println(Arrays.toString(arr[1]));//[0, 0]
        System.out.println(Arrays.toString(arr[1]));//[0, 0]
        System.out.println(Arrays.deepToString(arr));//[[0, 0], [0, 0], [0, 0]]
        arr[2][0]=1;
        arr[2][1]=8;
        arr[1][1]=3;
        System.out.println(Arrays.deepToString(arr));
        // Array olusturmak icin iki yontemimiz vardi
        // 2.yontem hem declare edip,hem de değer atama
        int arr2[][]={ {0}, {1,2}, {3,4,5} } ;
        System.out.println(Arrays.deepToString(arr2));
        System.out.println(Arrays.toString(arr2[1]));
            System.out.println(arr2[2][1]);// sadece bir rakam yazdırmak istersek
            // Arrays clasından yardım almaya gerek yok
}}
