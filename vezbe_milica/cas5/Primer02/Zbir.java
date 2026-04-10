package Primer02;

public class Zbir extends BinarniIzraz {

    public Zbir(Izraz levi, Izraz desni) {
        super(levi, desni);
    }

    @Override
    public double izracunaj() {
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
