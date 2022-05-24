package day38_overriding;

public class Baliklar extends Animals {
    public static void main(String[] args) {
        Baliklar balik1 = new Baliklar();
        balik1.beslenme();
        balik1.hareket();
        balik1.solunum();

    }
    @Override
    // Child class'daki bir method parent class'dan bir method'u override ediyorsa
    // bunu istersek @Override notasyonu ile deklare edebiliriz
    // Deklare etmesek de kodlarimiz calisir
    // Ancak deklare ettigimizde Java overriden method'u surekli kontrol eder
    // ve o method'da overriding'e uymayan bir degisiklik olursa CTE verir
    public  void  hareket(){
        System.out.println("Balıklar yüzerek hareket eder.");
    }

    public void solunum(){
        System.out.println("Balıklar solungac solunumu yaparlar.");

    }
}
