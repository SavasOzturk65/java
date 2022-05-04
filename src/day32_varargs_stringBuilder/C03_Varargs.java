package day32_varargs_stringBuilder;

public class C03_Varargs {
    public static void main(String[] args) {
        kafanaGoreIslem(2,3,5,6,7,8,10);
        // Varrags'da hic eleman olmasa da java itiraz etmez
        // once int olarak tanimlanan sayilari eslestirir
        // kalan tum sayilari varargs'a doldurur


    }

    private static void  kafanaGoreIslem(int sayi1,int sayi2,int sayi3,int...sayilar) {
        int toplam=0;
        for (int each:sayilar){
            toplam+= each;
        }
        System.out.println("ilk sayi ile diger Sayilarin Toplaminın carpimi : "+sayi1*toplam);
    }
}
