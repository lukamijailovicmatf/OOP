package zadatak1;

public class GeometrijskiSkup {

    // sadrzi niz objekata tipa GeometrijskaFigura
    private GeometrijskaFigura[] nizFigura;

    // konstruktor kao argument dobija niz figura
    public GeometrijskiSkup(GeometrijskaFigura[] nizFigura) {
        // ovde prolazi i plitko kopiranje referenci
        this.nizFigura = nizFigura;
    }

    public GeometrijskaFigura[] getNizFigura() {
        return nizFigura;
    }

    public double ukupnaPovrsina() {
        double ukupnaPovrsina = 0;
        for (GeometrijskaFigura gf : nizFigura) {
            ukupnaPovrsina += gf.povrsina();
        }
        return ukupnaPovrsina;
    }
}
