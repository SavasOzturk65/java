package day25_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Contains {
    public static void main(String[] args) {
        // verilen bir array'de tekrar eden elemntleri sadece birer tane yazarak
        // unique elemantlerden olusan bir array haline getirelim
        int arr[]= {1,2,2,3,3,4,5,6,2,3,4,9,6,5,8,7};
        List<Integer> tekrarsiz = new ArrayList<>();
        for (int i = 0; i< arr.length;i++){
            if (!tekrarsiz.contains(arr[i])){
                tekrarsiz.add(arr[i] );
            }
        }System.out.println(tekrarsiz);

int tekrarsizArray[] = new int[tekrarsiz.size()];
for (int i=0;i< tekrarsizArray.length;i++){
    tekrarsizArray[i] =tekrarsiz.get(i);

} System.out.println(Arrays.toString(tekrarsizArray));

    }


}