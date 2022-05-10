package day35_encapsulation_inheritance;

public class Personel {
    public String isim;
    protected String soyİsim;
    protected boolean calisiyorMu;
    protected String telNo;
    protected int yas;


    // eger variable'lara access modifier yazmazsak
    // Java access modifier olarak default acc.mod. atar
    // boyle olursa sadece o package altindaki child class'lar
    // Personel class'ini inherit nedebilir
    // Baska package'lardaki child class'larin da Personel'i inherit edebilmesi icin
    // variable ve method'larin acc.mod.'larini protected yapariz
    // Public yapsak da inherit edoilebilir ama biz herkesin erismesini degil de
    // sadece child class'larin erismesini istedigimizden protected'i tercih ederiz











    public static void main(String[] args) {

    }
}