package day37_inheritance;

public class Toyota extends Araba {
    protected boolean pahalimi = true;
    protected String uretimYeri ="Japonya";
    public void method1() {
        System.out.println("Toyota classından method1 calisti");
    }
    public void method2() {
        System.out.println("Toyota classından method2 calisti");
    }

}
