package day13_stringManipulations;

public class C03_Replace {
    public static void main(String[] args) {
        String str = "Java ögrenmek cok zevkli";
        System.out.println(str.replace(" ",""));
        System.out.println(str.replace("ögrenmek ","kod yazmak "));
        System.out.println(str.replace("e","a"));
    }
}
