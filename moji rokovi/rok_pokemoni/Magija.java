public class Magija {

    // atributi klase Magija
    private int snaga;
    private String ime;

    public Magija(int snaga, String ime) {
        this.snaga = snaga;
        this.ime = ime;
    }

    // konstruktor kopije
    public Magija(Magija o) {
        this(o.snaga, o.ime);
    }

    public int getSnaga() {
        return snaga;
    }

    public String getIme() {
        return ime;
    }

    @Override
    public String toString() {
        return ime + " " + snaga;
    }
}
