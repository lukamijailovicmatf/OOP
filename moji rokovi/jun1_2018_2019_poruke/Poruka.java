package com.example.jun1_2018_2019_poruke.zadatak1;

public abstract class Poruka implements Comparable<Poruka> {

    private Datum datum;
    private String tekstPoruke;

    public Poruka(String tekstPoruke, String datum) {
        this.tekstPoruke = tekstPoruke;
        this.datum = new Datum(datum);
    }

    // p.datum.toString() - toString() se poziva iz klase Datum
    public Poruka(Poruka p) {
        this(p.tekstPoruke, p.datum.toString());
    }

    public String getTekstPoruke() {
        return tekstPoruke;
    }

    public Datum getDatum() {
        return datum;
    }

    public abstract String sacuvajPoruku();

    @Override
    public String toString() {
        return datum + "\n" + tekstPoruke + "\n" + "-------------------------------------\n";
    }
}
