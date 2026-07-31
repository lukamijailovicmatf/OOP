package Primer01Geometrija;

public class Krug extends Elipsa {

    public Krug(Tacka centar, double r) {
        /* poziva se konstruktor Elipsa(Tacka centar, double a, double b) */
        super(centar, r, r);
    }

    public Krug(double r) {
        // poziva se konstruktor Elipsa(double a, double b)
        super(r, r);
    }

    // konstruktor kopije
    public Krug(Krug k) {
        this(k.centar, k.getPoluprecnik());
    }

    // metod koji se poziva nad objektom klase Krug
    public double getPoluprecnik() {
        // dohvatamo poluosu elipse tj. to je nas poluprecnik kruga
        return getA();
    }

    @Override
    public double obim() {
        return 2 * getPoluprecnik() * Math.PI;
    }

    @Override
    public double povrsina() {
        return getPoluprecnik() * getPoluprecnik() * Math.PI;
    }

    @Override
    public String toString() {
        return "Krug sa poluprecnikom " + getPoluprecnik() + " i centrom " + centar;
    }
}
