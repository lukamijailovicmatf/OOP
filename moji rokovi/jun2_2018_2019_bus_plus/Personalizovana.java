package com.example.jun2_2018_2019_bus_plus.zadatak1;

public class Personalizovana extends BusPlus {

    private Kategorija kategorija;
    private boolean imaDopunu; // označava da li je kartica dopunjena za tekući mesec

    // id i zona su iz klase BusPlus, a kategorija i imaDopunu su iz tekuce klase
    public Personalizovana(int id, int zona, Kategorija kategorija, boolean imaDopunu) {
        // poziva se konstruktor nadklase
        super(id, zona);
        this.kategorija = kategorija;
        this.imaDopunu = imaDopunu;
    }

    public Kategorija getKategorija() {
        return kategorija;
    }

    public boolean imaDopunu() {
        return imaDopunu;
    }

    @Override
    public String toString() {
        return "[" + kategorija + "] " + super.toString() + " | " + (imaDopunu() ? " dopunjena " : " bez dopune ");
    }

    @Override
    public int compareTo(BusPlus o) {
        if (o instanceof Nepersonalizovana) {
            return -1;
        } else {
            return this.kategorija.compareTo(((Personalizovana) o).kategorija);
        }
    }
}
