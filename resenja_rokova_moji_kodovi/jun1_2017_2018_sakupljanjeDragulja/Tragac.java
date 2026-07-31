package com.example.jun2_2017_2018.zadatak1;

import java.util.Random;

public class Tragac extends ObjekatIgre {

    private Ranac ranac;
    private static Random random = new Random();
    private static String smerKretanja = ""; // može imati vrednost dd (dole-desno) ili gl (gore-levo)

    public Tragac(String naziv, int X, int Y, Ranac ranac) {
        super(naziv, X, Y);
        this.ranac = ranac;
    }

    public Ranac getRanac() {
        return ranac;
    }

    public static void setSmerKretanja(String sk) {
        if (sk.equalsIgnoreCase("dd") || sk.equalsIgnoreCase("gl"))
            smerKretanja = sk;
    }

    public boolean pokupiDragulj(Rudnik rudnik) {
        return ranac.smestiDragulj(rudnik.getTezinaDragulja());
    }

    @Override
    public void izvrsiAkciju() {
        boolean horizontalno = random.nextBoolean();
        if (smerKretanja.equalsIgnoreCase("dd")) {
            if (horizontalno)
                X++;
            else
                Y++;
        } else if (smerKretanja.equalsIgnoreCase("gl")) {
            if (horizontalno)
                X--;
            else
                Y--;
        } else {
            System.out.println("Ovo ne bi trebalo da se desi! smer=" + smerKretanja);
        }
    }

    // Tragac: \textit{naziv} ima ranac: slobodnoTezina(maxTezina)
    @Override
    public String toString() {
        return "Tragac: " + super.toString() + " ima ranac " + ranac;
    }
}
