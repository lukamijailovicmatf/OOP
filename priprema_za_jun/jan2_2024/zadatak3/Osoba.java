package zadatak3;

/* Klasa Osoba koja predstavlja osobu sa imenom i prezimenom */

public class Osoba implements Comparable<Osoba> {

    private final String ime;
    private final String prezime;

    public Osoba(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    /* Predefinisana metoda za leksikografsko poredjenje osoba */
    public int compareTo(Osoba o) {
        int rezultatImena = this.ime.compareTo(o.ime);
        if (rezultatImena == 0) {
            return this.prezime.compareTo(o.prezime);
        }
        return rezultatImena;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }
}
