package Day05_matematikselişlemler;

public class C02_PreincrementPostincrement {
    public static void main(String[] args) {


        int a=15;
        int b=++a;
        System.out.println(b);

        int c=a++;
        System.out.println(c);

        int d=a;
        System.out.println(d);


        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
         sayi2=sayi1++;
        System.out.println(sayi1+ " , "+sayi2+" , "+sayi3);
        sayi3=++sayi1;
        System.out.println(sayi1+ " , "+sayi2+" , "+sayi3);
        System.out.println(sayi3++);
        System.out.println(sayi3);
        System.out.println(--sayi3);







    }
}
