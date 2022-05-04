package day23_multiDimensionalArrays;

public class C03_MDArrays {
    public static void main(String[] args) {
        // Soru 1 ) Aşağıdaki çok boyutlu array'in
        // tüm elemanlarının carpimini yazdıran bir metod yazınız.
        // { {1,2,3}, {4,5,6} }
        int arr[][]={{1,2},{4,1},{2,1,5}};
      carpimYazdir(arr);


    }

    private static void carpimYazdir(int[][] arr) {
        int carpim =1;
        for (int i = 0; i <arr.length;i++){
            for (int j =0;j<arr[i].length;j++){
                carpim *= arr[i][j];
            }
        } System.out.println(carpim);
    }
    }


