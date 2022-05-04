package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C07_Arrays {
    public static void main(String[] args) {
        // iki verilen array'i birlestiren
        // ve sonunda birlesikArray isminde bir array'e kaydeden
        // bir metod olusturunuz
        // main method içinde yeni array'i siralayip yazdirin



        int arr1[] = {3, 5, 7, 10};
        int arr2[] = {2, 4, 6, 8, 9};

        int[] bilesikArray =  birlestir(arr1, arr2);
        System.out.println(Arrays.toString(bilesikArray));
    }

    private static int[] birlestir(int[] arr1, int[] arr2) {
        int bilesikArray[]= Arrays.copyOf(arr1,arr1.length+arr2.length);
        //[3, 5, 7, 10,0,0,0,0]

        for (int i=0; i<arr1.length; i++){// 1.array'in elemanlarını birlesik array 'e atadik
            bilesikArray[i]=arr1[i];
        }for (int i =0; i<arr2.length;i++){
            bilesikArray[i+arr1.length] = arr2[i];
        }


        return bilesikArray;
    }

}


