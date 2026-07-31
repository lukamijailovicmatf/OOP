package Oblik;

/* Krug je specijalan slucaj elipse, tako da umesto da implementiramo slicnu funkcionalnost na dva mesta
   mozemo naslediti klasu Elipsa i iskoristiti vec postojece funkcionalnosti uz sitne izmene */
public class Krug extends Elipsa{

    public Krug(Tacka c, double r){
        /* Poziva se konstruktor Elipsa(Tacka centar, double a, double b) */
        super(c, r, r);
    }

    public Krug(double x, double y, double r){
        /* Poziva se konstruktor Elipsa(double x, double y, double a, double b) */
        super(x, y, r, r);
    }

    public Krug(double r){
        /* Poziva se konstruktor Elipsa(double a, double b) */
        super(r, r);
    }

    public Krug(Krug k){
        super(k.centar, k.a, k.a);
    }

    public double getPoluprecnik(){
        return this.a;
    }

    @Override
    public String toString() {
        /* Duzina poluose koju smo nasledili */
        return "Krug centar = " + centar + " r = " + a;
    }
}
