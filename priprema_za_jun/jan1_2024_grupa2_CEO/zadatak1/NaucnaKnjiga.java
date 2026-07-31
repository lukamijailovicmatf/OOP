package org.example.jan1_2024_grupa2_ceo.zadatak1;

public class NaucnaKnjiga extends Knjiga {

    private String naucnaOblast;

    public NaucnaKnjiga(String naslov, String autor, int brNaStanju, String[] komentari, String naucnaOblast) {
        super(naslov, autor, brNaStanju, komentari);
        this.naucnaOblast = naucnaOblast;
    }

    @Override
    public void prikaziInformacije() {
        System.out.println("Naslov: " + getNaslov());
        System.out.println("Autor: " + getAutor());
        System.out.println("Broj na stanju: " + getBrNaStanju());
        System.out.println("Naucna oblast: " + naucnaOblast);
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
