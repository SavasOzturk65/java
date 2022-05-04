package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Add {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>();
        System.out.println("bos liste "+isimler);
        isimler.add("Ali");
        System.out.println("bir elemanli liste : "+isimler);
        isimler.add("Veli");
        System.out.println("İki elemanli liste: "+isimler);
        isimler.add("Can");
        System.out.println("UC elemanli liste: "+isimler);
        isimler.add(1,"Yusuf");
        System.out.println("Dort elemanli liste: "+isimler);
        List<String> isimler2 = new ArrayList<>();
        isimler2.add("Ayse");
        isimler2.add("Fatma");
        System.out.println("2.Liste : "+isimler2);
        isimler.addAll(4,isimler2);
        System.out.println("2.listeyi sona ekledik."+ isimler);
        isimler.addAll(isimler2);
        System.out.println("2.listeyi ekledik."+ isimler);
    }
}
