package org.example.primer_roka.zadatak1;

public class Kvadrat extends GeometrijskaFigura {

    private double duzinaStranice;

    public Kvadrat(String ime, double duzinaStranice) {
        super(ime);
        this.duzinaStranice = duzinaStranice;
    }

    @Override
    public double povrsina() {
        return duzinaStranice * duzinaStranice;
    }

    @Override
    public void prikazi() {
        System.out.println("Kvadrat " + ime + " sa duzinom stranice " + duzinaStranice);
    }
}
