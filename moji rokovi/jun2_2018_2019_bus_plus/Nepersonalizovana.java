package com.example.jun2_2018_2019_bus_plus.zadatak1;

public class Nepersonalizovana extends BusPlus {

    private int kredit;
    private boolean ocitana; // označava da li je kartica očitana u vozilu

    public static int cenaVoznje = 90; // cenu karte za jednu vožnju u datoj zoni

    // id i zona su iz klase BusPlus, a kredit i ocitana su iz tekuce klase
    public Nepersonalizovana(int id, int zona, int kredit, boolean ocitana) {
        // poziva se konstruktor nadklase
        super(id, zona);
        this.kredit = kredit;
        this.ocitana = ocitana;
    }

    public int getKredit() {
        return kredit;
    }

    public boolean isOcitana() {
        return ocitana;
    }

    public boolean nedovoljnoKredita() {
        // uzmem kredit koji trenutno imam na kartici i od njega oduzmem cenu voznje za tu zonu
        // i proverim da li je to manje od nule
        return this.kredit - cenaVoznje < 0;
    }

    @Override
    public String toString() {
        return "[NP] " + super.toString() + ", kredit: " + kredit + " | " +
                (isOcitana() ? " ocitana " : (nedovoljnoKredita() ? " nedovoljno kredita " : " nije ocitana "));
    }

    public boolean ocitajKartu() {
        if (isOcitana())
            return false;

        if (nedovoljnoKredita())
            return false;

        this.ocitana = true;
        kredit = kredit - cenaVoznje;
        return true;
    }

    @Override
    public int compareTo(BusPlus o) {
        if (o instanceof Personalizovana) {
            return 1;
        } else {
            return Integer.compare(((Nepersonalizovana) o).kredit, this.kredit);
        }
    }
}
