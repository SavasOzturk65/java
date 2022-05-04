package day27_constructor_constructorCall;

public class Tir {
    int yil=2000;
    String renk;
    String model;
    int km;
    boolean satilikMi;

    public Tir(int i, String string, String str2, int j, boolean b) {
        km = i;
model =string ;
renk = str2;
yil = j;
satilikMi = b;
    }

    public Tir(int km, String model, String renk) {
        this.km =km;
        this.model =model;
        this.renk = renk;

    }
}
