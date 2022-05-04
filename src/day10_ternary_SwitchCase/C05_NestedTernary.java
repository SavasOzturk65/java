package day10_ternary_SwitchCase;

public class C05_NestedTernary {
    public static void main(String[] args) {
        char cinsiyet= 'E';
        int yas=62;
        String sonuc = cinsiyet=='K'?(yas>=60?"Emekli olabilirsin":"emekli olamazsın"):
                                     (yas>=65?"Emekli olabilirsin":"emekli olamazsın");
        System.out.println(sonuc);

    }








}
