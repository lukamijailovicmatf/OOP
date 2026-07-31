package Primer02;

public class Konstanta extends Izraz {

    private double vrednost; // privatno polje koje definise vrednost konstante

    public Konstanta(double vrednost){
        this.vrednost = vrednost;
    }

    // Konstruktor kopije
    public Konstanta(Konstanta k){
        this.vrednost = k.vrednost;
    }

    @Override
    public double izracunaj() {
        return vrednost;
    }

    @Override
    public Izraz klon() {
        // return new Konstanta(this);
        return new Konstanta(vrednost);
    }

    @Override
    public String toString() {
        // vestacki hocemo polje vrednost koje je tipa double da konvertujemo u String na ovaj nacin
        return vrednost + "";
    }
}
