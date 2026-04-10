package org.example.jan2_2024_ceo.zadatak1;

public class Direktiva {

    private String imeOsobe;
    private String naredba;

    // konstruktor
    public Direktiva(String imeOsobe, String naredba) {
        this.imeOsobe = imeOsobe;
        this.naredba = naredba;
    }

    // konstruktor kopije
    public Direktiva(Direktiva d) {
        this(d.imeOsobe, d.naredba);
    }

    public String getImeOsobe() {
        return imeOsobe;
    }

    public String getNaredba() {
        return naredba;
    }

    public void setImeOsobe(String imeOsobe) {
        this.imeOsobe = imeOsobe;
    }

    public void setNaredba(String naredba) {
        this.naredba = naredba;
    }

    @Override
    public String toString() {
        return "Direktiva za " + imeOsobe + ": " + naredba;
    }
}
