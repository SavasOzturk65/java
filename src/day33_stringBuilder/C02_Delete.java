package day33_stringBuilder;

public class C02_Delete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java candir can");
        sb.delete(12,15);
        System.out.println(sb);
    }
}
