package Primer01Geometrija;

public class Pravougaonik extends Oblik {

    /* Polja oznacavamo kao protected kako bi im mogli DIREKTNO pristupiti iz podklase (klase Kvadrat) */
    protected double sirina;
    protected double visina;

    public Pravougaonik(Tacka centar, double sirina, double visina) {
        /* Potrebno je da pozovemo konstruktor nadklase (UVEK PRI NASLEDJIVANJU) tako sto koristimo sintaksu
           slicnu this(...) osim sto koristimo super. Super je u stvari referenca na nadklasu (u ovom slucaju Oblik) */

        /* Poziva konstruktor Oblik(Tacka centar) */
        super(centar);

        /* Koristimo privatnu funkciju 'init' koja inicijalizuje sirinu i visinu kako bi smanjili visestruko
           ponavljanje iste logike */
        init(sirina, visina);
    }

    public Pravougaonik(double x, double y, double sirina, double visina) {
        // poziva konstruktor Oblik(double x, double y)
        super(x, y);
        init(sirina, visina);
    }

    public Pravougaonik(double sirina, double visina) {
        // poziva konstruktor Oblik()
        super();
        init(sirina, visina);
    }

    // konstruktor kopije
    public Pravougaonik(Pravougaonik p) {
        // poziva konstruktor Oblik(Tacka centar)
        super(p.centar);
        this.sirina = p.sirina;
        this.visina = p.visina;
    }

    private void init(double sirina, double visina) {
        this.sirina = sirina;
        this.visina = visina;
    }

    public double getSirina() {
        return sirina;
    }

    public double getVisina() {
        return visina;
    }

    @Override
    public double obim() {
        return 2 * sirina + 2 * visina;
    }

    @Override
    public double povrsina() {
        return sirina * visina;
    }

    @Override
    public String toString() {
        return "Pravougaonik sirina = " + sirina + " visina = " + visina;
    }
}