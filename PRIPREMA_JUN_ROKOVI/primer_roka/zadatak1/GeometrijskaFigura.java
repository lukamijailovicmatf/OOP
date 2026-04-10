package org.example.primer_roka.zadatak1;

public abstract class GeometrijskaFigura implements Ispis {

    protected String ime;

    public GeometrijskaFigura(String ime) {
        this.ime = ime;
    }

    public abstract double povrsina();
}
