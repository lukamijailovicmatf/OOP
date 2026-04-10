package org.example.jan1_2024_grupa2_ceo.zadatak1;

import java.util.ArrayList;
import java.util.List;

public class Knjizara {

    private List<Knjiga> knjige;

    public Knjizara() {
        this.knjige = new ArrayList<>();
    }

    public List<Knjiga> getKnjige() {
        return knjige;
    }

    // metoda za dodavanje knjige u knjizaru
    public void dodajKnjigu(Knjiga knjiga) {
        knjige.add(knjiga);
    }

    // Metoda za ispisivanje komentara za određenu knjigu na datom indeksu
    public void ispisiKomentare(int indeks) {
        if (indeks >= 0 && indeks < knjige.size()) {
            Knjiga knjiga = knjige.get(indeks);
            System.out.println("Komentari za knjigu " + knjiga.getNaslov() + ": ");
            System.out.println(knjiga.vratiKomentare());
        } else {
            System.out.println("Indeks knjige van opsega!");
        }
    }
}
