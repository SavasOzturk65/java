package day30_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_Immutable {
    public static void main(String[] args) {
        // String immutable bir class iken List mutable'dir
        String str= "Ali";
        str.toUpperCase();
        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str);
        List<String> isimler =new ArrayList<>();
        System.out.println(isimler);
        isimler.add("Ali");
        System.out.println(isimler);
        isimler.set(0,"Veli");
        System.out.println(isimler);
        isimler.remove(0);
        System.out.println(isimler);




    }
}
