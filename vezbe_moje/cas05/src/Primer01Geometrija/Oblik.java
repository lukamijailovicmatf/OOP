package Primer01Geometrija;

/* Klasa je apstraktna ako poseduje barem jednu apstraktnu funkciju.
   Apstraktne klase ne mozemo da instanciramo */
public abstract class Oblik {

    protected Tacka centar;

    public Oblik(Tacka centar) {
        this.centar = new Tacka(centar);
    }

    /* Ako nam korisnik ne prosledi argumente pri pozivu konstruktora, centar oblika postavljamo na podrazumevanu
       vrednost tj. u ovom slucaju (0,0) */
    public Oblik() {
        this.centar = new Tacka();
    }

    public Oblik(double x, double y){
        this.centar = new Tacka(x, y);
    }

    // konstruktor kopije
    public Oblik(Oblik o){
        this(o.centar);
    }

    public Tacka getCentar() {
        return centar;
    }

    /* Apstraktne funkcije samo deklarisemo, a podklasa treba da implementira njihovu logiku */
    /* U klasi Oblik ne znamo kako bi implementirali sledece dve funkcije jer nam nije poznato koji je
       oblik u pitanju */
    public abstract double obim();
    public abstract double povrsina();

    @Override
    public String toString() {
        return "Oblik sa centrom = " + centar;
    }
}
