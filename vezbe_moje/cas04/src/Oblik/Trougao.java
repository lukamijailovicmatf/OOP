package Oblik;

public class Trougao extends Oblik {

    private Tacka a;
    private Tacka b;
    private Tacka c;

    public Trougao(Tacka centar, Tacka a, Tacka b, Tacka c) {
        super(centar);
        init(a, b, c);
    }

    public Trougao(Tacka a, Tacka b, Tacka c) {
        /* Umesto this(new Tacka(0, 0), a, b, c) bolje je navedeno jer instanciramo jednu tacku manje
           (new Tacka(0, 0)) bi bio privremeni objekat koji se prosledjuje konstruktoru nadklase, a konstruktor
           nadklase pravi sopstvenu kopiju od privremenog objekta. Java kompilator bi ovo trebao da optimizuje
           ali svejedno je lepo primetiti */
        super();
        init(a, b, c);
    }

    public Trougao(Tacka centar, double a1, double a2, double b1, double b2, double c1, double c2){
        super(centar);
        init(a1, a2, b1, b2, c1, c2);
    }

    public Trougao(double a1, double a2, double b1, double b2, double c1, double c2){
        init(a1, a2, b1, b2, c1, c2);
    }

    public Trougao(double x, double y, double a1, double a2, double b1, double b2, double c1, double c2){
        super(x, y);
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

    public double getAB(){
        return a.rastojanje(b);
    }

    public double getBC(){
        return b.rastojanje(c);
    }

    public double getCA(){
        return a.rastojanje(c);
    }

    private void init(double a1, double a2, double b1, double b2, double c1, double c2){
        this.a = new Tacka(a1, a2);
        this.b = new Tacka(b1, b2);
        this.c = new Tacka(c1, c2);
    }

    private void init(Tacka a, Tacka b, Tacka c){
        this.a = new Tacka(a);
        this.b = new Tacka(b);
        this.c = new Tacka(c);
    }

    @Override
    public String toString() {
        return "Trougao a = " + a + " b = " + b + " c = " + c;
    }
}