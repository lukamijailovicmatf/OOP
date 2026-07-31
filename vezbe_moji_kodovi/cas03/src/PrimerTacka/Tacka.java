package PrimerTacka;

public class Tacka {

    private double x; // privatno polje za x koordinatu tacke

    private double y; // privatno polje za y koordinatu tacke

    private static int brojac = 0; // brojac za tacke

    // pravimo podrazumevani konstruktor za tacku
    public Tacka() {
        /* ukoliko ne postoji kolizija imena, poljima tekuceg objekta se moze pristupati i samo pomocu
           njihovog imena */
        x = 0;
        y = 0;
        //this(0, 0);
    }

    public Tacka(double x, double y){
        /* ukoliko postoji kolizija imena, poljima tekuceg objekta moramo pristupati koriscenjem kljucne
           reci this koja predstavlja referencu na tekuci objekat */
        this.x = x;
        this.y = y;

        brojac++;
    }

    public double setX() {
        this.x = x;
    }

    public static int getBrojac() {
        return brojac;
    }

    public Tacka(Tacka t){
        this(t.x, t.y);
    }

    public boolean jednake(Tacka t){
        return x == t.x && y == t.y;
    }

    public void transliraj(double px, double py){
        x = x + px;
        y = y + py;
    }

    public double rastojanje(Tacka t){
        return Math.sqrt(Math.pow(x - t.x, 2) + Math.pow(y - t.y, 2));
    }

    public static double rastojanje(Tacka t1, Tacka t2){
        return Math.sqrt(Math.pow(t1.x - t2.x, 2) + Math.pow(t1.y - t2.y, 2));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
