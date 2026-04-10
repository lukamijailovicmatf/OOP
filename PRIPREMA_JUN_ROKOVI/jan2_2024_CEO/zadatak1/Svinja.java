package org.example.jan2_2024_ceo.zadatak1;

public class Svinja extends Zivotinja {

    private String parola;

    // konstruktor
    public Svinja(String ime, String parola) {
        super(ime);
        this.parola = parola;
    }

    // konstruktor koji prihvata samo ime
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

    @Override
    public String toString() {
        return "Svinja " + getIme() + " kaze: " + parola;
    }
}
