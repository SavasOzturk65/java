package day36_inhritance;

import day35_encapsulation_inheritance.Muhasebe;
import day35_encapsulation_inheritance.Personel;

public class Memur extends Muhasebe {
    public static void main(String[] args) {
        Memur memur1 = new Memur();
        memur1.isim="Hasan";
        memur1.saatUcreti=16;
        memur1.maas= memur1.maasHesaplama();
        System.out.println(memur1.isim+" 'inin maasi "+ memur1.maas);

    }
}
