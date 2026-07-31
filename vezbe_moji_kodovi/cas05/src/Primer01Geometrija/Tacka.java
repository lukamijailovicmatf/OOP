package Primer01Geometrija;

public class Tacka {

    private double x;
    private double y;

    /* Privatna staticka promenljiva koju cemo koristiti da brojimo koliko je instancirano objekata
       klase 'Tacka' */
    private static int brojTacaka = 0;

    public Tacka(double x, double y){
        this.x = x;
        this.y = y;
        /* Kada se poziva konstruktor, sigurni smo da se instancira objekat klase kojoj konstruktor
           pripada. To je pravi trenutak da inkrementiramo brojac objekata */
        brojTacaka++;
    }

    public Tacka(){
        /* this(0, 0) poziva konstruktor Tacka(double x, double y) koji nadalje preuzima
           odgovornost za inicijalizaciju objekta. Na ovaj nacin mozemo smanjiti kolicinu koda i logike
           koja se ponavlja. Primetimo da sada ne moramo da vrsimo brojanje objekata jer to radi konstruktor
           kojem delegiramo posao */
        this(0, 0);

        // Alternativni kod:
        // this.x = 0;
        // this.y = 0;
        // brojTacaka++;
    }

    public Tacka(Tacka t){
        this(t.x, t.y);

        // Alternativni kod:
        // this.x = t.x;
        // this.y = t.y;
        // brojTacaka++;
    }

    /* Staticka funkcija koja racuna euklidsko rastojanje izmedju datih tacaka */
    /* NE POZIVA se nad objektom, vec direktno iz klase */
    /* npr: double dist = Tacka.distance(t1, t2); */
    public static double distance(Tacka a, Tacka b){
        return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
    }

    /* Metod koji racuna rastojanje od tekuce tacke do date tacke */
    /* Tacka t = new Tacka();  Tacka s = new Tacka(10, 0); */
    /* double dist = t.distance(s); */
    public double distance(Tacka t){
        /* Umesto da ponavljamo logiku, mozemo iskoristiti vec postojecu funkciju koja nam racuna rastojanje
           koje nam treba */
        return Tacka.distance(this, t);
    }

    /* Nas interni brojac krijemo od spoljasnjeg sveta, spoljasnjem svetu dozvoljavamo samo da procita
       vrednost brojaca */
    public static int getBrojTacaka(){
        return brojTacaka;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void translate(double dx, double dy){
        x += dx;
        y += dy;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
