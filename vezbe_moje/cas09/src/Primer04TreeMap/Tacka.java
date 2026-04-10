package Primer04TreeMap;

public class Tacka implements Comparable<Tacka> {

    private int x;
    private int y;

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

    @Override
    public int compareTo(Tacka o) {
        return x == o.x ? Integer.compare(y, o.y) : Integer.compare(x, o.x);
    }
}
