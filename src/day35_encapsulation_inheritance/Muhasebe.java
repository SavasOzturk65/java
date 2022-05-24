package day35_encapsulation_inheritance;

public class Muhasebe extends Personel {

    protected int saatUcreti;
    protected String statü;
    protected int maas;
     public Muhasebe (){
        System.out.println("Memur parametresiz constructor calisti");
    }

    public static void main(String[] args) {


        Muhasebe clsn1= new Muhasebe();
        clsn1.isim ="Ali";
        System.out.println(clsn1.isim+" "+clsn1.soyİsim);

    }
    public int maasHesaplama(){
        int maas=8*25*saatUcreti;
        return maas;
    }
}
