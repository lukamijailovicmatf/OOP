package com.example.jun_2017_2018_pokemoni.zadatak1;

public abstract class Pokemon implements Comparable<Pokemon> {

    private String ime;
    private int nivo;
    private Magija magija1;
    private Magija magija2;
    private Magija poslednjaBacena = null;
    private int zivot = 100;

    public Pokemon(String ime, int nivo, Magija magija1, Magija magija2) {
        this.ime = ime;
        this.nivo = nivo;
        this.magija1 = magija1;
        this.magija2 = magija2;
    }

    public void setPoslednjaBacena(Magija poslednjaBacena) {
        this.poslednjaBacena = poslednjaBacena;
    }

    public Magija getPoslednjaBacena() {
        return poslednjaBacena;
    }

    public String getIme() {
        return ime;
    }

    public int getNivo() {
        return nivo;
    }

    public Magija getMagija1() {
        return magija1;
    }

    public Magija getMagija2() {
        return magija2;
    }

    public int getZivot() {
        return zivot;
    }

    public void nanesiStetu(int kolikoStete) {
        zivot = zivot - kolikoStete;
    }

    public abstract void baciMagiju(Pokemon neprijatelj);

    @Override
    public String toString() {
        return "lvl" + nivo + " " + ime;
    }

    public int compareTo(Pokemon o) {
        if (this instanceof IgracPokemon && o instanceof CpuPokemon) {
            return -1;
        } else if (this instanceof CpuPokemon && o instanceof IgracPokemon) {
            return 1;
        } else if (this instanceof IgracPokemon && o instanceof IgracPokemon) {
            return Integer.compare(o.getNivo(), this.getNivo());
        } else if (this instanceof CpuPokemon && o instanceof CpuPokemon) {
            return Integer.compare(o.getNivo(), this.getNivo());
        } else {
            return Integer.compare(this.getNivo(), o.getNivo());
        }
    }
}
