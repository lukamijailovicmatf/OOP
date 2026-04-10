package Primer01Geometrija;

public class Kvadrat extends Pravougaonik {

    public Kvadrat(Tacka centar, double duzina) {
        super(centar, duzina, duzina);
    }

    public Kvadrat(double duzina) {
        super(duzina, duzina);
    }

    public double getDuzina() {
        return getSirina();
    }

    @Override
    public double obim() {
        return 4 * getDuzina();
    }

    @Override
    public double povrsina() {
        return getDuzina() * getDuzina();
    }

    @Override
    public String toString() {
        return "Kvadrat sa duzinom " + getDuzina() + " i centrom " + centar;
    }
}
