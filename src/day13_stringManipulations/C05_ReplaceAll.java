package day13_stringManipulations;

public class C05_ReplaceAll {
    public static void main(String[] args) {
        String str = "Java        ogrenmek       çok     zevkli";

str = str.replaceAll("\\s+"," ");
        System.out.println(str);

str = str.replaceAll("\\S","*");


        System.out.println(str);


    }
}
