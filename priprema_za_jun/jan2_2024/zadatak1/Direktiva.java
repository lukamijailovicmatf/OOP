package zadatak1;

/* Klasa Direktiva koja predstavlja naredbu za izvršenje */

public class Direktiva {

    private String imeOsobe;
    private String naredba;

    public Direktiva(String imeOsobe, String naredba) {
        this.imeOsobe = imeOsobe;
        this.naredba = naredba;
    }

    /* Konstruktor kopije */
    public Direktiva(Direktiva direktiva) {
        this(direktiva.imeOsobe, direktiva.naredba);
        /* this.imeOsobe = direktiva.imeOsobe; */
        /* this.naredba = direktiva.naredba; */
    }

    public String getImeOsobe() {
        return imeOsobe;
    }

    public void setImeOsobe(String imeOsobe) {
        this.imeOsobe = imeOsobe;
    }

    public String getNaredba() {
        return naredba;
    }

    public void setNaredba(String naredba) {
        this.naredba = naredba;
    }

    /* Metod toString za ispis direktive */
    @Override
    public String toString() {
        return "Direktiva za " + imeOsobe + ": " + naredba;
    }
}
