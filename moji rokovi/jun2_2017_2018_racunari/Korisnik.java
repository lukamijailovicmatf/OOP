package com.example.jun2_2017_2018_racunari.zadatak1;

import java.util.Map;
import java.util.TreeMap;

public class Korisnik {

    private String korisnickoIme;
    private int vipKrediti;
    private Map<Racunar, Double> dugovi;

    public Korisnik(String korisnickoIme, int vipKrediti) {
        this.korisnickoIme = korisnickoIme;
        this.vipKrediti = vipKrediti;
        this.dugovi = new TreeMap<>();
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public int getVipKrediti() {
        return vipKrediti;
    }

    public void dodajRacunar(Racunar r) {
         dugovi.put(r, 0.0);
    }

    public void azurirajDug(Racunar r, double cena) {
        dugovi.put(r, cena);
    }

    public void umanjiVipKredite() {
        vipKrediti--;
    }

}
