package Primer00;

public class TestiranjeStringBuilde {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("mmatematicki");
        sb.append("fakultet");
        System.out.println("sb.append: " + sb);

        sb.delete(0, 1);
        System.out.println("sb.delete: " + sb);

        sb.insert(11, " ");
        System.out.println("sb.insert: " + sb);

        sb.setCharAt(0, 'M');
        System.out.println("sb.setCharAt: " + sb);

        sb.reverse();
        System.out.println("sb.reverse: " + sb);

        // ...

    }
}
