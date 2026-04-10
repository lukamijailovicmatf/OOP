package Oblik;

/* Kvadrat je specijalan slucaj pravougaonika, tako da umesto da implementiramo slicnu funkcionalnost na dva mesta
   mozemo naslediti klasu Pravougaonik i iskoristiti vec postojece funkcionalnosti uz sitne izmene */
public class Kvadrat extends Pravougaonik{

    public Kvadrat(Tacka c, double a){
        /* Poziva se konstruktor Pravougaonik(Tacka centar, double sirina, double visina) */
        super(c, a, a);
    }

    public Kvadrat(double x, double y, double a){
        /* Poziva se konstruktor Pravougaonik(double x, double y, double sirina, double visina) */
        super(x, y, a, a);
    }

    public Kvadrat(double a){
        /* Poziva se konstruktor Pravougaonik(double sirina, double visina) */
        super(a, a);
    }

    /* Konstruktor kopije */
    public Kvadrat(Kvadrat k){
        /* Poziva se konstruktor Pravougaonik(Tacka centar, double sirina, double visina) */
        super(k.centar, k.sirina, k.sirina);
    }

    public double getDimenzija(){
        return this.sirina;
    }

    @Override
    public String toString() {
        return "Kvadrat centar = " + centar + " a = " + sirina;
    }
}
