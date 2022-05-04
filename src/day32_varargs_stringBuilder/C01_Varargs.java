package day32_varargs_stringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {
         topla(2,3,5,6,7,8,10);
     // varargs list gibi davranir ama
        // array methodlari ile calisir

   }

    private static void topla(int...sayilar) {
        int toplam=0;
        for (int each:sayilar){
            toplam+= each;
        }
        System.out.println("Girilen Sayilarin Toplami : "+toplam);
    }
}
