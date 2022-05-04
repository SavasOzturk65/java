package day11_stringManipulations;

public class C04_IndexOf {
    public static void main(String[] args) {
        // parametre olarak girilen bir char veya string'in
        // ilk index'ini verir
        String str = "Calisirsaniz , Java ögrenmek çok kolay";
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("Java"));// aradigimiz charSquence anlamli veya anlamsiz bir kelime olabilir
        // bu durumda java aradigimiz CS'i tek bir paket gibi dusunur ve o paketin baslangic index'ini bize verir

        System.out.println(str.indexOf('T'));
        System.out.println(str.indexOf('a'));
 // -1 aradığınız karakter yok demektir.





    }




}
