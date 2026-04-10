package zadatak1;

/* Bazna klasa Zivotinja */

public class Zivotinja {

    protected String ime;

    public Zivotinja(String ime) {
        this.ime = ime;
    }

    public Zivotinja(Zivotinja zivotinja) {
        this(zivotinja.ime);
        /* this.ime = zivotinja.ime; */
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    /* Predefinisana metoda toString */
    @Override
    public String toString() {
        return "";
    }
}
