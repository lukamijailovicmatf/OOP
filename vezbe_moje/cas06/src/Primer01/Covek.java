package Primer01;

public abstract class Covek {
    private String ime;
    private String prezime;
    private int godine;

    public Covek(String ime, String prezime, int godine){
        // mozemo sa notacijom this jer su sve primitivni tipovi pa mogu da idu ovako dodele
        // String je klasni tip ali imutabilan pa i nad njim moze this
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
    }

    @Override
    public String toString() {
        return ime + " " + prezime + " " + godine;
    }
}
