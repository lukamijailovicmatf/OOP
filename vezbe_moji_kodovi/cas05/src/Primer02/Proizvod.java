package Primer02;

public class Proizvod extends BinarniIzraz{

    public Proizvod(Izraz levi, Izraz desni){
        // Poziva se konstruktor nadklase: BinarniIzraz(Izraz levi, Izraz desni);
        super(levi, desni);
    }

    @Override
    public double izracunaj() {
        return getLevi().izracunaj() * getDesni().izracunaj();
    }

    @Override
    public Izraz klon() {
        // Posto nemamo polja direktno definisana u samoj klasi dovlacimo ih uz pomoc getera iz klase
        // Binarni izraz (zato sto su ta polja tamo privatna), koju nasledjuje klasa Proizvod
        return new Proizvod(getLevi().klon(), getDesni().klon());
    }

    @Override
    public String toString() {
        return "(" + getLevi() + ")" + " * " + "(" + getDesni() + ")";
    }
}
