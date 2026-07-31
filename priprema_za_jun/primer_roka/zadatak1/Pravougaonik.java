package org.example.primer_roka.zadatak1;

public class Pravougaonik extends GeometrijskaFigura {

    private double duzina;
    private double sirina;

    public Pravougaonik(String ime, double duzina, double sirina) {
        super(ime);
        this.duzina = duzina;
        this.sirina = sirina;
    }

    @Override
    public double povrsina() {
        return duzina * sirina;
    }

    @Override
    public void prikazi() {
        System.out.println("Pravougaonik " + ime + " sa duzinom " + duzina + " i sirinom " + sirina);
    }
}
