package com.example.jun2_2017_2018.zadatak1;

public class Rudnik extends ObjekatIgre {

    private int otvorenJos;
    private double tezinaDragulja;

    public Rudnik(String naziv, int X, int Y, int otvorenJos, double tezinaDragulja) {
        // pozivamo konstruktor nadklase tj. konstruktor iz klase ObjekatIgre
        super(naziv, X, Y);
        this.otvorenJos = otvorenJos;
        this.tezinaDragulja = tezinaDragulja;
    }

    public int getOtvorenJos() {
        return otvorenJos;
    }

    public double getTezinaDragulja() {
        return tezinaDragulja;
    }

    // metoda koja nam kazuje da li je rudnik otvoren
    public boolean isOtvoren() {
        return otvorenJos > 0;
    }

    @Override
    public void izvrsiAkciju() {
        if (isOtvoren())
            otvorenJos = otvorenJos - 1;
    }

    // Rudnik: \textit{naziv} je otvoren jos otvorenJos poteza
    @Override
    public String toString() {
        return "Rudnik: " + super.toString() + " je otvoren jos " + otvorenJos + " poteza";
    }
}
