package day25_arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C03_Sort {
    public static void main(String[] args) {
        List<String> isimler= new ArrayList<>();
        isimler.add("Kutlu");
        isimler.add("Ali");
        isimler.add("Veli");
        System.out.println(isimler);
        Collections.sort(isimler);
        System.out.println(isimler);
    }
}
