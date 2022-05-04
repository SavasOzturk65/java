package day17_forLoops;

public class C07_NestedForLoop {
    public static void main(String[] args) {
        // 1'den 4'e kadar sayilari yan yana aralarinda bir bosluk birakarak yazdirin


        for (int satir =1;satir<=4;satir++){
            for (int i=1;i<=6;i++)
            {System.out.print(satir*i+" ");}
            System.out.println(" ");
        }


        }
    }

