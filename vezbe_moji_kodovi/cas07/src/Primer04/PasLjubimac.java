package Primer04;

/* Definisemo klasu PasLjubimac koja sadrzi objekat Buva kao clan koji je
   takodje cloneable
*/

public class PasLjubimac extends Zivotinja implements Cloneable {

    private Buva buva;
    private String ime;
    private String rasa;

    public PasLjubimac(String ime, String rasa){
        super("Pas");
        this.buva = new Buva("Buvica", "Neka vrsta buve");
        this.ime = ime;
        this.rasa = rasa;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }

    public String getRasa() {
        return rasa;
    }

    public Buva getBuva() {
        return buva;
    }

    public void setBuva(Buva buva) {
        this.buva = buva;
    }

    @Override
    public void zvuk() {
        System.out.println("AV, AV!");
    }

    @Override
    public String toString() {
        return super.toString() + " - " + ime + ", " + rasa + " sa buvom " + buva;
    }

    // Predefinisemo nasledjeni metod clone() da bismo ga ucinili public
    // Nasledjeni metod izbacuje CloneNotSupportedException izuzetak
    // pa se metod mora deklarisati na prikazani nacin, inace nece
    // proci kompajliranje
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
