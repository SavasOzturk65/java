package day28_constructorCall_staticKeyword;



public class C02 {
    int x = 5;
    static int y = 10;
    public static void main(String[] args) {
        // 3 tane obje olusturalim ve degisimleri gozlemleyelim


        C02 obje1 = new C02();
        System.out.println("obje 1 icin x :  "+obje1.x+",  obje 1 icin y :  "+obje1.y);
        obje1.x++;
        obje1.y++;
        System.out.println("islemden sonra obje 1 icin x :  "+obje1.x+", islemden sonra obje 1 icin y :  "+obje1.y);
        C02 obje2 =new C02();
        System.out.println("obje 2 icin x :  "+obje2.x+",  obje 2 icin y :  "+obje2.y);
obje2.x++;
obje2.y++;
        System.out.println("islemden sonra obje 2 icin x :  "+obje2.x+", islemden sonra obje 2 icin y :  "+obje2.y);
        System.out.println("obje2 olusturulduktan sonra obje1 in x: :  "+obje1.x+", obje1 in y :  "+obje1.y);
        C02 obje3 = new C02();
        obje3.x=20;
        obje3.y =40;
        System.out.println("Obje3 oluşturulduktan sonra obje1 için x : "+obje1.x);
        System.out.println("Obje3 oluşturulduktan sonra obje2 için x : "+obje2.x);
        System.out.println("Obje3 oluşturulduktan sonra obje3 için x : "+obje3.x);
        System.out.println("Obje3 oluşturulduktan sonra obje1 için y : "+obje1.y);
        System.out.println("Obje3 oluşturulduktan sonra obje2 için y : "+obje2.y);
        System.out.println("Obje3 oluşturulduktan sonra obje3 için y : "+obje3.y);





    }
}
