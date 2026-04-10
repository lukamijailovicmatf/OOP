package Oblik;

public class Oblik {

    /* Polje oznacavamo kao protected kako bi mogli da mu pristupimo iz podklasa (klase Pravougaonik,
       Elipsa i Trougao) */
    protected Tacka centar;

    public Oblik(Tacka c){
        /* Primetimo da instanca klase Oblik dobija SOPSTVENU KOPIJU tacke od koje se konstruise,
           ne koristi prosledjenu tacku direktno */

        /* Pozivamo konstruktor kopije za tacku */
        centar = new Tacka(c);
    }

    /* Konstruktor kopije za oblik */
    public Oblik(Oblik o){
        /* Mozemo delegirati odgovornost vec implementiranom konstruktoru */
        this(o.centar);
    }

    public Oblik(double x, double y){
        centar = new Tacka(x,y);
    }

    public Oblik(){
        /* Poziva se podrazumevani konstruktor za tacku */
        centar = new Tacka();
    }

    /* Pravimo geter za centar */
    public Tacka getCentar() {
        return centar;
    }

    @Override
    public String toString() {
        return "Oblik centar = " + centar.toString();
    }
}
