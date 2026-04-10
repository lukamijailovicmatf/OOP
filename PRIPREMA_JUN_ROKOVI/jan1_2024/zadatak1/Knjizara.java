	package zadatak1;

import java.util.ArrayList;
import java.util.List;

public class Knjizara {

    protected List<Knjiga> knjige;

    // konstruktor
    public Knjizara() {
        this.knjige = new ArrayList<>();
    }

    // Metoda za dodavanje knjige u knjizaru
    public void dodajKnjigu(Knjiga knjiga) {
        knjige.add(knjiga);
    }

    // Metoda za ispisivanje komentara za određenu knjigu na datom indeksu
    public void ispisiKomentare(int indeks) {
        if (indeks >= 0 && indeks < knjige.size()) {
            Knjiga knjiga = knjige.get(indeks);
            System.out.println("Komentari za knjigu " + knjiga.naslov + ": ");
            System.out.println(knjiga.vratiKomentare());
        } else {
            System.out.println("Indeks knjige van opsega.");
        }
    }
}
