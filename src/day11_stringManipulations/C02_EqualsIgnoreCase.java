package day11_stringManipulations;

public class C02_EqualsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "ali";
        String str2 = "can";
        String str3 = "Ali Can" ;
        String str4 = str1+ " "+str2;
        System.out.println(str4);
        System.out.println(str3==str4);// false  sebebi hem değerler hem de referanslar farklı
        System.out.println(str3.equals(str4));// false sebebi değerler farklı
        System.out.println(str3.equalsIgnoreCase(str4));
        // true sebebi ise bu özellik büyük harf küçük harf ayrımına bakmaz.
    }
}
