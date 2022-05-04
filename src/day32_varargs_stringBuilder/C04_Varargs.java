package day32_varargs_stringBuilder;

public class C04_Varargs {
    public static void main(String[] args) {
        topla(2,3,5,6,7,8,10);
        // varargs'dan once farkli parametreler kullanilabilir
        // ama varargs'dan sonra parametre yazilamaz
        // jazarsaniz java vararg son parametre olmaliddir diye sizi uyarir
        // ve CTE verir

    }

    private static void topla(int...sayilar) {
        int toplam=0;
        for (int each:sayilar){
            toplam+= each;
        }
        System.out.println("Girilen Sayilarin Toplami : "+toplam);
    }
}
