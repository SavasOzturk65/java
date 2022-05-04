package day16_forLoops;

public class C04_ForLoop {
    public static void main(String[] args) {
        for (int i=10; i<=30; i++){
           if (i==30){
               System.out.println(i);
           } else
           {
            System.out.print(i+",");}

        }
        System.out.println();
        for (int i=10; i<=29; i++) {
            System.out.print(i+",");
           } System.out.println(30);
    }


    }

