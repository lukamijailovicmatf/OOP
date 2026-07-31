package zadatak1;

public class Roman extends Knjiga {

    private String zanr;

    public Roman(String naslov, String autor, int brNaStanju, String[] komentari, String zanr) {
        super(naslov, autor, brNaStanju, komentari);
        this.zanr = zanr;
    }

    // Implementacija metode prikaziInformacije
    @Override
    public void prikaziInformacije() {
        System.out.println("Naslov: " + naslov);
        System.out.println("Autor: " + autor);
        System.out.println("Broj primeraka na stanju: " + brNaStanju);
        System.out.println("Zanr: " + zanr);
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
