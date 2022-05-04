package day06_concetenation_Operators;

public class C01_Concetenation {
    public static void main(String[] args) {

       String str1="Java";
       String str2="Güzel";
       int sayi1=3;
       int sayi2=5;
       // Java2Güzel
        System.out.println(str1+(sayi2-sayi1)+str2);
        //Güzel15Java
        System.out.println(str2+sayi1*sayi2+str1);
        //53Güzel
        System.out.println(""+ sayi2+sayi1+str2);





    }
}
