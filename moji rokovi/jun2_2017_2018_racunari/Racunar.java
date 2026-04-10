package com.example.jun2_2017_2018_racunari.zadatak1;

import java.util.List;

public abstract class Racunar {

    private String ime;
    private int cenovniKoef;

    public Racunar(String ime, int cenovniKoef) {
        this.ime = ime;
        this.cenovniKoef = cenovniKoef;
    }

    public String getIme() {
        return ime;
    }

    public int getCenovniKoef() {
        return cenovniKoef;
    }

    // lista duzineKoriscenja sadrži dužine vremenskih intervala korišćenja datog računara
    // bez prestanka u minutima
    public abstract double izracunajCenu(List<Integer> duzineKoriscenja);
}
