package Primer01Geometrija;

public class Elipsa extends Oblik {

    // poluose elipse
    private double a;
    private double b;

    public Elipsa(Tacka centar, double a, double b) {
        // pozivamo konstruktor iz klase Oblik
        super(centar);
        init(a, b);
    }

    public Elipsa(double a, double b) {
        // pozivamo konstruktor bez argumenata iz klase Oblik
        super();
        this.a = a;
        this.b = b;
    }

    // Konstruktor kopije
    public Elipsa(Elipsa e) {
        // pozivamo konstruktor iz trenutne klase
        this(e.centar, e.a, e.b);
    }

    public double getA() {
        return a;
    }

    // privatni metod za inicijalizaciju
    private void init(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double obim() {
        /* Ramanujan - ova aproksimacija */
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    @Override
    public double povrsina() {
        // r ^ 2 * pi
        return a * b * Math.PI;
    }

    @Override
    public String toString() {
        return "Elipsa sa poluosama " + a + ", " + b + " i centrom " + centar;
    }
}
