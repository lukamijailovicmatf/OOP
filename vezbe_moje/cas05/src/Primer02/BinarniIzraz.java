package Primer02;

public abstract class BinarniIzraz extends Izraz{

    private Izraz levi; /* levi podizraz binarnog izraza */
    private Izraz desni; /* desni podizraz binarnog izraza */

    public BinarniIzraz(Izraz levi, Izraz desni){
        this.levi = levi.klon();
        this.desni = desni.klon();
    }

    /* Polje je private pa pravimo geter */
    public Izraz getLevi() {
        return levi;
    }

    /* Polje je private pa pravimo geter */
    public Izraz getDesni() {
        return desni;
    }
}
