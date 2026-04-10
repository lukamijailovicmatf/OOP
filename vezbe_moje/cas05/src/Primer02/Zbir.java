package Primer02;

public class Zbir extends BinarniIzraz{
    public Zbir(Izraz levi, Izraz desni){
        /* Poziva konstruktor BinarniIzraz(Izraz levi, Izraz desni) */
        super(levi, desni);
    }

    @Override
    public double izracunaj() {
        /* Racunamo prvo levi podizraz pa onda racunamo desni podizraz i na kraju objedinimo njihove zbirove */
        return getLevi().izracunaj() + getDesni().izracunaj();
    }

    @Override
    public Izraz klon() {
        return new Zbir(getLevi().klon(), getDesni().klon());
    }

    @Override
    public String toString() {
        return "(" + getLevi() + ")" + " + " + "(" + getDesni() + ")";
    }
}
