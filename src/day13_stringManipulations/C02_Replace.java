package day13_stringManipulations;

public class C02_Replace {
    public static void main(String[] args) {
        {
            // String olarak verilen 10.000 sayisinin
            // binden buyuk olup olmadigini yazdirin

            String sonuc = "10.000";
            sonuc = sonuc.replace(".",""); // 10000 'e cevirip sonuc'a assign ettik
            // = oldugu icin sonuc kalici olarak degisti
            if (Integer.valueOf(sonuc)>1000){
                System.out.println("bulunan sonuc sayısı 1000 den fazla");
            } else {
                System.out.println("Bulunan sonuc sayisi 1000 den az");
            }
        }
    }}



