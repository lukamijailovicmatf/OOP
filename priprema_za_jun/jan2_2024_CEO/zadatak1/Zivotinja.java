package org.example.jan2_2024_ceo.zadatak1;

public class Zivotinja {

    private String ime;

    // konstruktor
    public Zivotinja(String ime) {
        this.ime = ime;
    }

    // konstruktor kopije
    public Zivotinja(Zivotinja z) {
        this(z.ime);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    @Override
    public String toString() {
        return "";
    }
}
