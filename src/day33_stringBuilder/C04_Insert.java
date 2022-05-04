package day33_stringBuilder;

public class C04_Insert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Javayı ögrendik.");
        sb.insert(6," cok iyi");
        System.out.println(sb);
        sb.insert(7," cok, ",1,5);
        System.out.println(sb);
    }
}
