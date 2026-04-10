package Primer02;

public class Promenljiva extends Izraz {

    private String ime;
    private double vrednost;

    public Promenljiva(String ime, double vrednost){
        /* Mozemo da radimo klasicne dodele bez new i pravljenja novih objekata odredjene klase jer su
           nam tipovi primitivni (double) i klasni (String - ali je imutabilan) */
        this.ime = ime;
        this.vrednost = vrednost;
    }

    @Override
    public double izracunaj() {
        // promenljivu racunamo tako sto vratimo njenu vrednost
        return vrednost;
    }

    public Izraz klon() {
        /* Vrati novi objekat klase Promenljiva i parametre mu postavi pomocu klasnog konstruktora
           Promenljiva(String ime, double vrednost) */
        return new Promenljiva(ime, vrednost);
    }

    @Override
    public String toString() {
        return ime;
    }
}
