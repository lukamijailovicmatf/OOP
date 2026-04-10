package org.example.jan1_2024_grupa2_ceo.zadatak1;

public class TestKnjizara {
    public static void main(String[] args) {

        Knjizara knjizara = new Knjizara();

        // Knjiga(String naslov, String autor, int brNaStanju, String[] komentari)
        knjizara.dodajKnjigu(new Roman("Ana Karenjina", "Lav Tolstoj",10,
                             new String[]{"odlicna", "preporucujem"}, "Ljubavni roman"));

        knjizara.dodajKnjigu(new NaucnaKnjiga("Osnovi programiranja", "Predrag Janicic", 10,
                             new String[]{"najjaca stvar", "kidalica"}, "Programiranje"));

        knjizara.dodajKnjigu(new Roman("Put na mesec", "Zil Vern", 10,
                             new String[]{"majstorska", "razbija"}, "Avanturisticki roman"));

        // Iteriranje kroz knjižaru i prikazivanje informacija o svakoj knjizi
        for (int i = 0; i < knjizara.getKnjige().size(); i++) {
            System.out.println("Informacije o knjizi: ");
            Knjiga knjiga = knjizara.getKnjige().get(i);
            knjiga.prikaziInformacije();
            System.out.println();
        }

        // ispisivanje komentara za knjigu na indeksu 2
        knjizara.ispisiKomentare(2);
    }
}
