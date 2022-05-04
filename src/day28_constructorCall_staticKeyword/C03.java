package day28_constructorCall_staticKeyword;

public class C03 {
    public static void main(String[] args) {
        // Java run time bir programdir
        // run tusuna bastigimizda java calismaya baslar ve islemleri yapar
        // javanin isi bittiginde (calisma tusu kirmizidan griye dondugunde)
        // hersey basa doner

        // static variable ve method'lar bulunduklari class ile ilintilidir (obje ile degil class ile)
        // baska bir class'da iken C02'deki static variable veya method'a ulasmak istedigimizde
        // C02.staticVariableIsmi  ve C02.staticMethodIsmi() yazmamiz yeterli olur



        C02 obje1 = new C02();
        System.out.println("obje 1 icin x :  "+obje1.x+",  obje 1 icin y :  "+obje1.y);
        obje1.x++;
        obje1.y++;
        // Java run time bir programdir
        // run tusuna bastigimizda java calismaya baslar ve islemleri yapar
        // javanin isi bittiginde (calisma tusu kirmizidan griye dondugunde)
        // hersey basa doner

        // static variable ve method'lar bulunduklari class ile ilintilidir (obje ile degil class ile)
        // baska bir class'da iken C02'deki static variable veya method'a ulasmak istedigimizde
        // C02.staticVariableIsmi  ve C02.staticMethodIsmi() yazmamiz yeterli olur

        System.out.println("islemden sonra obje 1 icin x :  "+obje1.x+", islemden sonra obje 1 icin y :  "+obje1.y);
        C02 obje2 =new C02();
        System.out.println("obje 2 icin x :  "+obje2.x+",  obje 2 icin y :  "+obje2.y);
        obje2.x++;
        C02.y++;
        System.out.println("islemden sonra obje 2 icin x :  "+obje2.x+", islemden sonra obje 2 icin y :  "+C02.y);
        System.out.println("obje2 olusturulduktan sonra obje1 in x: :  "+obje1.x+", obje1 in y :  "+C02.y);
        C02 obje3 = new C02();
        obje3.x=20;
        C02.y =40;
        System.out.println("Obje3 oluşturulduktan sonra obje1 için x : "+obje1.x);
        System.out.println("Obje3 oluşturulduktan sonra obje2 için x : "+obje2.x);
        System.out.println("Obje3 oluşturulduktan sonra obje3 için x : "+obje3.x);
        System.out.println("Obje3 oluşturulduktan sonra obje1 için y : "+C02.y);
        System.out.println("Obje3 oluşturulduktan sonra obje2 için y : "+C02.y);
        System.out.println("Obje3 oluşturulduktan sonra obje3 için y : "+C02.y);
    }
}
