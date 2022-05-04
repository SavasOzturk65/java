package day32_varargs_stringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {
        kafanaGoretopla(2,3,5,6,7,8,10);
        // varargs list gibi davranir ama
        // array methodlari ile calisir

    }

    private static void kafanaGoretopla(int sayi1,int...sayilar) {
        int toplam=0;
        for (int each:sayilar){
            toplam+= each;
        }
        System.out.println("ilk sayi ile diger Sayilarin Toplaminın carpimi : "+sayi1*toplam);

    }
}
