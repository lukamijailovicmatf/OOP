	package zadatak3;

/* Generička klasa MatematickiSkup koja predstavlja matematički skup */

import java.util.Arrays;
import java.util.Optional;

public class MatematickiSkup<T> {

    private final String ime;
    private Object[] elementi;
    private int kapacitet;

    public MatematickiSkup(String ime, int kapacitet) {
        this.ime = ime;
        this.kapacitet = kapacitet;
        this.elementi = new Object[kapacitet];
    }

    /* Metoda za proveru postojanja elementa u skupu */
    public boolean postoji(T element) {
        for (Object e : elementi) {
            if (e != null && e.equals(element)) {
                return true;
            }
        }
        return false;
    }

    /* Metoda za dodavanje elementa u skup */
    public void dodaj(T element) {
        if (!postoji(element)) {
            if (elementi.length == kapacitet) {
                kapacitet *= 2;
                elementi = Arrays.copyOf(elementi, kapacitet);
            }
        }
        for (int i = 0; i < elementi.length; i++) {
            if (elementi[i] == null) {
                elementi[i] = element;
                break;
            }
        }
    }

    /* Metoda za pronalaženje maksimuma u skupu */
    public Optional<T> nadjiMaksimum() {
        if (elementi.length == 0) {
            return Optional.empty();
        }
        T max = (T) elementi[0];
        for (int i = 1; i < elementi.length; i++) {
            if (elementi[i] != null && ((Comparable<T>) elementi[i]).compareTo(max) > 0) {
                max = (T) elementi[i];
            }
        }
        return Optional.of(max);
    }

    /* Metoda za pronalaženje unije dva skupa */
    public MatematickiSkup<T> unija(MatematickiSkup<T> s) {
        MatematickiSkup<T> unijaSkupova = new MatematickiSkup<>(this.ime + " u " + s.ime, this.kapacitet + s.kapacitet);
        for (Object e : this.elementi) {
            if (e != null) {
                unijaSkupova.dodaj((T) e);
            }
        }
        for (Object e : s.elementi) {
            if (e != null) {
                unijaSkupova.dodaj((T) e);
            }
        }
        return unijaSkupova;
    }

    /* Predefinisana metoda toString za ispis skupa */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append(" = { ");
        for (Object e : elementi) {
            if (e != null) {
                sb.append(e).append(", ");
            }
        }
        if (sb.length() > 3) {
            /* Uklanjanje poslednjeg zareza i razmaka */
            sb.setLength(sb.length() - 2);
        }
        sb.append(" } ");
        return sb.toString();
    }
}
