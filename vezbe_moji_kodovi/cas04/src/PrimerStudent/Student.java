package PrimerStudent;

public class Student {
    private String ime; // privatno polje za ime
    private String prezime; // privatno polje za prezime
    private String alas; // privatno polje za alas nalog
    private double prosek; // privatno polje za prosek

    // pravimo konstruktor za studenta
    public Student(String ime, String prezime, String alas, double prosek){
        this.ime = ime;
        this.prezime = prezime;
        this.alas = alas;
        this.prosek = prosek;
    }

    // pravimo geter za ime
    public String getIme() {
        return ime;
    }

    // pravimo geter za prezime
    public String getPrezime() {
        return prezime;
    }

    // pravimo geter za alas nalog
    public String getAlas() {
        return alas;
    }

    // pravimo geter za prosek
    public double getProsek() {
        return prosek;
    }

    // pravimo seter za alas nalog
    public void setAlas(String alas) {
        if(validirajAlas(alas)){
            this.alas = alas;
        }else{
            System.err.println("nevalidan alas");
        }
    }

    // privatna funkcija koja proverava ispravnost alas naloga
    private boolean validirajAlas(String alas){
        if(alas.length() != 7){
            System.err.println("nevalidna duzina");
            return false;
        }else if(alas.charAt(0) != 'm'){
            System.err.println("nevalidan modul");
            return false;
        }else if(alas.charAt(1) != 'i' && alas.charAt(1) != 'r'){
            System.err.println("nevalidan smer");
            return false;
        }else{
            for(int i = 2; i < alas.length(); i++){
                if(!Character.isDigit(alas.charAt(i))){
                    System.err.println("nevalidan indeks");
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return ime + " " + prezime + " " + alas + " " + prosek;
    }
}
