package primer02Comparator.comparatorV4;

import java.util.Comparator;

public class Tacka {

    private int x;
    private int y;

    // Anonimnu klasu iz proslog paketa (comparatorV3) mozemo
    // zameniti lambda izrazom (anonimna funkcija) koja ce
    // generisati potreban comparator u zavisnosti od toga kako
    // definisemo lambdu.
    public static Comparator<Tacka> porediPoXPaY =
            (o1, o2) -> o1.x == o2.x ? Integer.compare(o1.y, o2.y) : Integer.compare(o1.x, o2.x);

    // Ukoliko nam je potrebno da sortiramo tacke na vise nacina,
    // mozemo definisati novi komparator na slican nacin kao u
    // prethodnom primeru.
    public static Comparator<Tacka> porediPoYPaX =
            (o1, o2) -> o1.y == o2.y ? Integer.compare(o1.x, o2.x) : Integer.compare(o1.y, o2.y);

    public Tacka(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
