package day29_staticBlock_passByValeu;

public class C03_PassByValue {
    public static void main(String[] args) {
        // biz 100 tl ye satilan bir urun icin 2 farkli indirim uygulayan iki method olusturalim
        int fiyat= 100;

        System.out.println(indirimYap25(fiyat));
        System.out.println("method'dan sonra main method'daki fiyat : " + fiyat);
        fiyat =indirimYap10(fiyat);
        System.out.println("method'dan sonra main method'daki fiyat : " + fiyat);
    }

    private static int indirimYap25(int fiyat) {
        fiyat*=0.75;
        System.out.println("%25 imdirimli fiyat :  "+fiyat);
        return fiyat;
    }

    private static int indirimYap10(int fiyat) {
        fiyat*=0.9;
        System.out.println("%10 imdirimli fiyat :  "+fiyat);
        return fiyat;
    }
}

