package day11_stringManipulations;

import java.util.concurrent.CancellationException;

public class C01_Equals {
    public static void main(String[] args) {

int a= 10;
int b = a+0;
        System.out.println(a==b);

        char  ch1 = 'K';
        char  ch2 = 'K'+0;

        System.out.println(ch2==ch1);

String str1 = "Ali";
String str2 = "Can";
String str3 = "Ali Can" ;
String str4 = str1+ " "+str2;
        System.out.println(str4);
        System.out.println(str3==str4);// false  sebebi değerler aynı referanslar farklı
        System.out.println(str3.equals(str4));// true sebebi değerler aynı
// String variable'larda == hem degere hem de referansina bakar dolayisiyla objeler farkli oldugunda
        // genelde false doner
        // str1.equals(str2) ise referanslara degil SADECE DEGERE bakar,
        // eger case sensitive olarak String degerleri ayni ise true doner
    }



    }

