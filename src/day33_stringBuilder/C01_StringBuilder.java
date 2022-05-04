package day33_stringBuilder;

public class C01_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        StringBuilder sb2= new StringBuilder("Java candir");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("mehlika");
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());

        StringBuilder sb4 = new StringBuilder(7);
        sb4.append("Nilgun");
        System.out.println(sb4.length());
        System.out.println(sb4.capacity());

        sb4.append(" nil");
        System.out.println(sb4.length());
        System.out.println(sb4.capacity());

    }
}

