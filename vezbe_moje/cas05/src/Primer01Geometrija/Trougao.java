package Primer01Geometrija;

public class Trougao extends Oblik {

    private Tacka a;
    private Tacka b;
    private Tacka c;

    public Trougao(Tacka centar, Tacka a, Tacka b, Tacka c){
        /* Poziva konstruktor Oblik(Tacka centar) */
        super(centar);
        init(a, b, c);
    }

    public Trougao(Tacka a, Tacka b, Tacka c){
        // super();
        init(a, b, c);
    }

    /* Konstruktor kopije */
    public Trougao(Trougao t){
        /* Poziva konstruktor Trougao(Tacka centar, Tacka a, Tacka b, Tacka c) */
        this(t.centar, t.a, t.b, t.c);
    }

    public Trougao(Tacka centar, double a1, double a2, double b1, double b2, double c1, double c2){
        super(centar);
        init(a1, a2, b1, b2, c1, c2);
    }

    public Trougao(double x1, double x2, double a1, double a2, double b1, double b2, double c1, double c2){
        super(x1, x2);
        init(a1, a2, b1, b2, c1, c2);
    }

    public Tacka getA() {
        return a;
    }

    public Tacka getB() {
        return b;
    }

    public Tacka getC() {
        return c;
    }

    public double strAB(){
        return a.distance(b);
    }

    public double strBC(){
        return b.distance(c);
    }

    public double strAC(){
        return a.distance(c);
    }

    private void init(double a1, double a2, double b1, double b2, double c1, double c2){
        this.a = new Tacka(a1, a2); // pravimo tacku A
        this.b = new Tacka(b1, b2); // pravimo tacku B
        this.c = new Tacka(c1, c2); // pravimo tacku C
    }

    private void init(Tacka a, Tacka b, Tacka c){
        this.a = new Tacka(a);
        this.b = new Tacka(b);
        this.c = new Tacka(c);
    }

    public double obim(){
        return strAB() + strBC() + strAC();
    }

    @Override
    public double povrsina() {
        // poluobim
        double h = obim() / 2;
        // Heronov obrazac
        return Math.sqrt(h * (h - strAB()) * (h - strBC()) * (h - strAC()));
    }

    @Override
    public String toString() {
        return "Trougao sa temenima " + a + ", " + b + ", " + c + " i centrom " + centar;
    }
}