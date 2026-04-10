package com.example.jun2_2017_2018.zadatak1;

public class Ranac {

    private double maxTezina;
    private double slobodnoTezine;

    public Ranac(double maxTezina) {
        this.maxTezina = maxTezina;
        this.slobodnoTezine = maxTezina;
    }

    public double getSlobodnoTezine() {
        return slobodnoTezine;
    }

    public boolean smestiDragulj(double tezina) {
        if (slobodnoTezine >= tezina) {
            slobodnoTezine = slobodnoTezine - tezina;
            return true;
        }
        return false;
    }

    // ranac: slobodnoTezina(maxTezina)
    @Override
    public String toString() {
        return "ranac: " + slobodnoTezine + "(" + maxTezina + ")";
    }
}
