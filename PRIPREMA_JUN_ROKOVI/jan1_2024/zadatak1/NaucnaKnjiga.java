package zadatak1;

public class NaucnaKnjiga extends Knjiga {

    private String naucnaOblast;

    public NaucnaKnjiga(String naslov, String autor, int brNaStanju, String[] komentari, String naucnaOblast) {
        super(naslov, autor, brNaStanju, komentari);
        this.naucnaOblast = naucnaOblast;
    }

    // Implementacija metode prikaziInformacije
    @Override
    public void prikaziInformacije() {
        System.out.println("Naslov: " + naslov);
        System.out.println("Autor: " + autor);
        System.out.println("Broj primaraka na stanju: " + brNaStanju);
        System.out.println("Naucna oblast: " + naucnaOblast);
    }

    @Override
    public String vratiKomentare() {
        StringBuilder sb = new StringBuilder();
        for (String komentar : komentari) {
            sb.append(komentar).append("\n");
        }
        return sb.toString();
    }
}
