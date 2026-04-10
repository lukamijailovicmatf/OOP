package primer01Comparable;

public class Tacka implements Comparable<Tacka> {

    private int x;
    private int y;

    public Tacka() {
        this(0,0);
    }

    public Tacka(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Tacka(Tacka t) {
        this(t.x, t.y);
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

    @Override
    public int compareTo(Tacka o) {
        // Ako tacke imaju istu x koordinatu,
        // poredimo ih po y koordinati.
        if (x == o.x)
            return y - o.y;
        return x - o.x;
    }
}