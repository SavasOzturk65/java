package day21_scope_arrays;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {
        //Array'in elemanlarini yazdirmak istersek loop ile yazdirabiliriz
        int arr[]={1,2,3,55,65};
        for (int i =0 ;i<arr.length;i++){
        System.out.print(arr[i]+" ");}
        // tum elementleri yazdirabiliriz
        System.out.println(" ");
        // Ya da Arrays Class'indan yardim alip  direk array olarak yazdirabiliriz
        System.out.println(Arrays.toString(arr));

    }

}
