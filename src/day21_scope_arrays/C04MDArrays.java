package day21_scope_arrays;

public class C04MDArrays {
    public static void main(String[] args) {
        // Soru 2) Aşağıdaki multi dimensional array (çok boyutlu dizi)'in
        //         ic array (dizi)'lerindeki son elemanlarin carpimini
        //         yazdiran bir program yaziniz {1,2,3}, {4,5}, {6} }

        int arr[][]={{1,2,3}, {4,5}, {6} };
        int sonuc = 1;
        for (int i =0 ;i <arr.length;i++){
            sonuc = sonuc * arr[i][arr[i].length - 1];

        } System.out.println(sonuc);
    }
}
