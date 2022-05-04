package day13_stringManipulations;

public class C04_ReplaceAll {
    public static void main(String[] args) {
        String str = "*Java 98ogrenmek c..ok k876olay";
        str = str.replaceAll("\\d",""); //         str = str.replaceAll("\\d","")
        str = str.replaceAll("\\s","x");  //*Javaxogrenmekxc..okxkolay
                str = str.replaceAll("\\W",""); //Javaxogrenmekxcokxkolay
        str = str.replace("x"," "); //Javaxogrenmekxcokxkolay
        System.out.println(str);
    }
}
