package org.example.jan2_2024_ceo.zadatak3;

import java.util.Comparator;

public class Osoba {

    private String ime, prezime;

    public Osoba(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public Osoba(Osoba osoba) {
        this(osoba.ime, osoba.prezime);
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }

    public static Comparator<Osoba> poredi = (o1, o2) -> o1.ime.equals(o2.ime) ? o1.prezime.compareTo(o2.prezime) : o1.ime.compareTo(o2.ime);
}