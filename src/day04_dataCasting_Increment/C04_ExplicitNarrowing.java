package day04_dataCasting_Increment;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {
        int sayi1=555;
        double sayi2=10;
        double sayi3=sayi1/sayi2;
        System.out.println(sayi3);

        int sayi4=(int) (sayi1/sayi2);
        // java double sayı data türündeki veriyi int veri türüne dönüştürmek için
        // bizden sorumluluğu almamızı ister bunuda işlemin önüne parantez içinde int yazarak yaparız.
        System.out.println(sayi4);

int sayi5=140;
byte sayi6=(byte) sayi5;
        System.out.println(sayi6);
        double sayi7=8883.5;


                byte sayi8=(byte)sayi7;
        System.out.println("son sayi :" + sayi8);









    }
}
