package day27_constructor_constructorCall;

public class TirRunner {
    public static void main(String[] args) {
      Tir tir1 =new Tir(5000 ,      "axor",          "Beyaz",           2020 ,      false);
                 //int km,           String model,           String renk,            int yil,     boolean satilikMi
        System.out.println(tir1.km+" "+ tir1.model+ " "+ tir1.renk+ " "+tir1.yil+" "+tir1.satilikMi);
        Tir tir2 = new Tir(1200, "kar", "kirmizi");
        System.out.println(tir2.km+" "+ tir2.model+ " "+ tir2.renk);


    }
}
