package org.example.jan2_2024_ceo.zadatak3;

import java.util.*;

public class MatematickiSkup<T> {

    private String ime;
    private T[] elementi;
    private int kapacitet;
    private Comparator<T> komparator;

    public MatematickiSkup(String ime, T[] elementi, int kapacitet, Comparator<T> komparator) {
        this.ime = ime;
        this.elementi = elementi;
        this.kapacitet = kapacitet;
        this.komparator = komparator;
    }

    public MatematickiSkup(MatematickiSkup<T> MatSkup) {
        this(MatSkup.ime, MatSkup.elementi, MatSkup.kapacitet, MatSkup.komparator);
    }

    public String getIme() {
        return ime;
    }

    public T[] getElementi() {
        return elementi;
    }

    public int getKapacitet() {
        return kapacitet;
    }

    public boolean postoji(T element) {
        Arrays.sort(elementi, komparator);
        if(Arrays.binarySearch(elementi, element, komparator) >= 0)
            return true;
        else
            return false;
    }

    public void dodaj(T element) {
        if(!postoji(element)) {
            if(elementi.length == kapacitet)
                kapacitet *= 2;
            elementi = Arrays.copyOf(elementi, elementi.length + 1);
            elementi[elementi.length - 1] = element;
        }
    }

    public Optional<T> nadjiMaksimum() {
        if (elementi.length != 0) {
            List<T> lista_elemenata = new ArrayList<>(Arrays.asList(elementi));
            return Optional.of(Collections.max(lista_elemenata, komparator));
        }
        return Optional.empty();
    }

    MatematickiSkup<T> unija(MatematickiSkup<T> s) {
        T[] unija_elemenata = Arrays.copyOf(elementi, elementi.length);
        MatematickiSkup<T> union = new MatematickiSkup<>(ime + " u " + s.ime, unija_elemenata, elementi.length + s.elementi.length, komparator);
        for (int i = 0; i < s.elementi.length; i++) {
            if(!postoji(s.elementi[i]))
                union.dodaj(s.elementi[i]);
        }
        return union;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ime + " = {");
        for (int i = 0; i < elementi.length; i++) {
            if(i != elementi.length - 1)
                sb.append(elementi[i] + ", ");
            else
                sb.append(elementi[i] + "}");
        }
        return sb.toString();
    }
}