package com.example.jun_2017_2018_pokemoni.zadatak1;

public class Magija {

    private int snaga;
    private String ime;

    public Magija(int snaga, String ime) {
        this.snaga = snaga;
        this.ime = ime;
    }

    public int getSnaga() {
        return snaga;
    }

    public String getIme() {
        return ime;
    }

    // konstruktor kopije
    public Magija(Magija o) {
        this(o.snaga, o.ime);
    }

    @Override
    public String toString() {
        return ime + " " + snaga;
    }
}
