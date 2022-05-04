package day24_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {
    public static void main(String[] args) {
        List<String> harfler = new ArrayList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.add("C");
        harfler.add("D");
        System.out.println(harfler);
        harfler.remove(1);// bu satir gidip 1 index'indeki elemani remove eder
        // ve (delil olarak) remove ettigi elemani bize getirir
        System.out.println(harfler);
        System.out.println(harfler.remove("D"));// gidip D yi remove eder ve true dondurur
        System.out.println(harfler.remove("G"));// listede B olmadigi icin remove yapamaz
        // gorevi yapamadigi icin false doner
        System.out.println(harfler);
        harfler.add("A");
        harfler.add("B");
        harfler.add("C");
        System.out.println(harfler);
        System.out.println(harfler.remove("A"));
        System.out.println(harfler);
        harfler.add("A");
        System.out.println(harfler.removeAll(harfler));// verilen bir listeyi siler
        System.out.println(harfler);
        // eger listemiz integer'lardan olusuyorsa
        // Java remove(index) ve remove(Object) method'lari karismasin diye
        // girilen sayiyi index olarak kabul eder.
    }
}
