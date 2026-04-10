package zadatak1;

public abstract class Knjiga implements PrikazKomentara {

    protected String naslov;
    protected String autor;
    protected int brNaStanju;
    protected String[] komentari;

    // Konstruktor
    public Knjiga(String naslov, String autor, int brNaStanju, String[] komentari) {
        this.naslov = naslov;
        this.autor = autor;
        this.brNaStanju = brNaStanju;
        this.komentari = komentari;
    }

    // Apstraktna metoda prikaziInformacije() koja ce biti implementirana u svakoj konkretnoj podklasi
    public abstract void prikaziInformacije();
}
