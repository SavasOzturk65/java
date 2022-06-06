package day40;

public class CC01_Exception {
    public static void main(String[] args) {
        int a =20;
        int b= 10;
        System.out.println("sayıların bölümü  : "+a/b);
        System.out.println("İşlem tamam");//System.out.println("sayıların bölümü  : "+c/d);// sayı /0= tanımsız Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at day40.CC01_Exception.main(CC01_Exception.java:11)
        int c =20;
        int d= 0;
        //System.out.println("sayıların bölümü  : "+c/d);// sayı /0= tanımsız Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at day40.CC01_Exception.main(CC01_Exception.java:11)

       try {System.out.println("sayıların bölümü  : "+c/d);}
       catch (ArithmeticException e){
           System.out.println("Bir sayi sifira bölünemez");
       }
       System.out.println(" Exception İşlem tamam");
    }
}
