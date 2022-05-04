package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_List {
    public static void main(String[] args) {
        // verilen bir listede, icinde belirli bir harf olan elemanlari
        // silen bir method yaziniz
        List<String> str = new ArrayList<>();
        str.add("Ceyhun");
        str.add("Mahmut");
        str.add("Musa");
        str.add("Ahmet");
        str.add("Ali");
        str.add("Veli");
        str.add("Mustafa");
        System.out.println(str);

        String silinecekHarf ="a";
        str =killThemAll(str,silinecekHarf);
    }

    private static List<String> killThemAll(List<String> str, String silinecekHarf) {
        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).contains(silinecekHarf)) {
                str.remove(i);
            i--;}

            }System.out.println(str);
        return str;
    }}


