package day32_varargs_stringBuilder;

public class C06_StringBuilder {
    public static void main(String[] args) {
        String str = "Ali Can";
        String str2 = new String("Veli");
        System.out.println(str2);
        StringBuilder sb = new StringBuilder("Yaşasın Java");

        System.out.println(sb);
        sb.append("!!!");
        System.out.println(sb);
        sb.toString().toUpperCase();
        System.out.println(sb);
        String büyükHarf =sb.toString().toUpperCase();
        System.out.println(büyükHarf);


    }
}
