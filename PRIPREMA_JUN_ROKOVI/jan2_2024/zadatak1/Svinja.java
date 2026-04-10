package zadatak1;

public class Svinja extends Zivotinja {

    private String parola;

    /* Konstruktor klase Svinja */
    public Svinja(String ime, String parola) {
        super(ime);
        this.parola = parola;
    }

    /* Konstruktor koji postavlja podrazumevanu parolu */
    public Svinja(String ime) {
        super(ime);
        this.parola = "Sve su zivotinje jednake";
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    /* Predefinisana metoda toString za ispis */
    @Override
    public String toString() {
        return "Svinja " + ime + " kaze: " + parola;
    }
}
