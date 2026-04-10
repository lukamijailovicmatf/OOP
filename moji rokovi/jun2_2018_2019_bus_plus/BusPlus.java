package com.example.jun2_2018_2019_bus_plus.zadatak1;

public abstract class BusPlus implements Comparable<BusPlus> {

    private int id;   // identifikator kartice
    private int zona; // 1 ili 2

    // konstruktor koji prima oba atributa
    public BusPlus(int id, int zona) {
        this.id = id;
        this.zona = zona;
    }

    public int getId() {
        return id;
    }

    public int getZona() {
        return zona;
    }

    @Override
    public String toString() {
        return "zona: " + zona;
    }
}
