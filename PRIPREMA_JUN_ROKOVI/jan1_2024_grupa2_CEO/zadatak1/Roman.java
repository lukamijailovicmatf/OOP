package org.example.jan1_2024_grupa2_ceo.zadatak1;

public class Roman extends Knjiga {

    private String zanr;

    public Roman(String naslov, String autor, int brNaStanju, String[] komentari, String zanr) {
        super(naslov, autor, brNaStanju, komentari);
        this.zanr = zanr;
    }

    @Override
    public void prikaziInformacije() {
        System.out.println("Naslov: " + getNaslov());
        System.out.println("Autor: " + getAutor());
        System.out.println("Broj na stanju: " + getBrNaStanju());
        System.out.println("Zanr: " + zanr);
    }

    @Override
    public String vratiKomentare() {
        StringBuilder sb = new StringBuilder();
        for (String komentar : getKomentari()) {
            sb.append(komentar).append("\n");
        }
        return sb.toString();
    }
}
