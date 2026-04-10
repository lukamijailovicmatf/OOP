package org.example.primer_roka.zadatak1;

public class GeometrijskiSkup {

    private GeometrijskaFigura[] nizFigura;

    public GeometrijskiSkup(GeometrijskaFigura[] nizFigura) {
        this.nizFigura = nizFigura;
    }

    public GeometrijskaFigura[] getNizFigura() {
        return nizFigura;
    }

    public double ukupnaPovrsina() {
        double sumaPovrsina = 0;
        for (GeometrijskaFigura gf : nizFigura) {
            sumaPovrsina += gf.povrsina();
        }
        return sumaPovrsina;
    }
}
