package zadatak2;

public class GenericList<T> {

    // unutrasnja klasa koja predstavlja cvor liste
    private static class Cvor<T> {
        T podatak;
        Cvor<T> sledeci;

        // konstruktor za cvor
        public Cvor(T podatak) {
            this.podatak = podatak;
            this.sledeci = null;
        }
    }

    // pocetni cvor liste
    private Cvor<T> glava;

    // konstruktor za praznu listu
    public GenericList() {
        this.glava = null;
    }

    // metod za dodavanje elementa na kraj liste
    public void dodaj(T podatak) {
        Cvor<T> noviCvor = new Cvor<>(podatak);
        if (glava == null) {
            glava = noviCvor;
        } else {
            Cvor<T> trenutni = glava;
            while (trenutni.sledeci != null) {
                trenutni = trenutni.sledeci;
            }
            trenutni.sledeci = noviCvor;
        }
    }

    // metod za uklanjanje poslednjeg elementa iz liste
    public void ukloniPoslednji() {
        if (glava == null) {
            return;
        }
        if (glava.sledeci == null) {
            glava = null;
            return;
        }
        Cvor<T> trenutni = glava;
        while (trenutni.sledeci.sledeci != null) {
            trenutni = trenutni.sledeci;
        }
        trenutni.sledeci = null;
    }

    // metoda za ispisivanje svih elemenata liste
    public void ispisi() {
        Cvor<T> trenutni = glava;
        while (trenutni != null) {
            System.out.println(trenutni.podatak + " ");
            trenutni = trenutni.sledeci;
        }
        System.out.println();
    }

    // Generička metoda count koja prebrojava koliko puta se određeni element nalazi u listi
    public int count(T element) {
        int broj = 0;
        Cvor<T> trenutni = glava;
        while (trenutni != null) {
            if (trenutni.podatak.equals(element)) {
                broj++;
            }
            trenutni = trenutni.sledeci;
        }
        return broj;
    }


}
