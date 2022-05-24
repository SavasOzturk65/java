package day35_encapsulation_inheritance;

public class Isci extends Muhasebe{
    protected String statü;
    protected String meslegi;
    protected String sendika;
  public Isci (){
     System.out.println("Isci parametresiz constructor calisti");
 }


    public static void main(String[] args) {
        Isci isci1 =new Isci();
        isci1.meslegi ="kaynakci";
        isci1.saatUcreti=20;
        isci1.isim="Ahmet";
        isci1.maas= isci1.maasHesaplama();
        System.out.println(isci1.isim+" 'nin maasi "+isci1.maas);

    }
}
