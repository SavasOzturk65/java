package day06_concetenation_Operators;

public class C02_MantikOperatörleri {
    public static void main(String[] args) {



        boolean sonuc1=5+2==7;

        System.out.println(sonuc1);

        boolean sonuc2=5*3!=10;
        System.out.println(sonuc2);
        boolean sonuc3=5*3<=10;
        System.out.println(sonuc3);
        boolean sonuc4=5<=10*3;
        System.out.println(sonuc4);
        boolean sonuc5=5>=10*3;
        System.out.println(sonuc5);
        boolean sonuc6=5!=10*3;
        System.out.println(sonuc6);

        boolean sonuc7=(2+5!=7)&&(3*5<=15);
        System.out.println(sonuc7);
        boolean sonuc8=(2+5!=7)||(3*5<=15);
        System.out.println(sonuc8);
// &&(and-ve) de hepsi true olura sonuç true
        // ||(OR-VEYA)de hepsi false olursa sonuç false olur.




    }
}
