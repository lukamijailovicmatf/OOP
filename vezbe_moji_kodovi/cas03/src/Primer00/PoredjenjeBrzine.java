package Primer00;

public class PoredjenjeBrzine {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(); // pravljenje StringBuilder - a
        String s = ""; // pravljenje jedne prazne niske

        int n = 20; // za dimenziju dokle petlja ide
        String pom = "matf"; // pomocna niska koju cemo nadovezivati na nisku s

        long pocetak = System.nanoTime();

        for(int i = 0; i < n; i++)
            sb.append(pom);

        long kraj = System.nanoTime();

        System.out.println("StringBuilder: " + (kraj - pocetak));
        System.out.println(sb);

        pocetak = System.nanoTime();

        for(int i = 0; i < n; i++)
            s += pom;

        kraj = System.nanoTime();

        System.out.println("String: " + (kraj - pocetak));
        System.out.println(s);

    }
}
