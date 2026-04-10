package Kloniranje;

public class Pas extends Zivotinja implements Cloneable {

    private String ime;
    private Buva buva;

    // mora u potpisu ...throws CloneNotSupportedException jer koristimo buva.clone() !!!
    public Pas(String vrsta, String ime, Buva buva) throws CloneNotSupportedException {
        super(vrsta);
        this.ime = ime;
        this.buva = (Buva) buva.clone(); // ili pozovemo neki konstruktor iz klase Buva
//      this.buva = new Buva(getVrsta(), buva.getIme());
    }

    public String getIme() {
        return ime;
    }

    public Buva getBuva() {
        return buva;
    }

    @Override
    public void oglasavanje() {
        System.out.println("av av");
    }

    @Override
    public String toString() {
        return "Pas " + ime + " sa buvom " + buva.getIme();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Pas klon = (Pas) super.clone(); // napravljen klon psa
        klon.buva = (Buva) klon.buva.clone(); // napravljen klon za buvu psa

        return klon;
    }
}
