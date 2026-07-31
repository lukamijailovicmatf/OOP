package zadatak1;

public class TestKnjizara {
    public static void main(String[] args) {
        // Kreiranje instance knjizare
        Knjizara knjizara = new Knjizara();

        // dodavanje knjiga u knjizaru
        knjizara.dodajKnjigu(new Roman("Ana Karenjina", "Lav Tolstoj", 10,
                             new String[]{"Odlicna knjiga!", "Preporucujem"}, "Ljubavni roman"));

        knjizara.dodajKnjigu(new NaucnaKnjiga("Programiranje u Javi", "John Smith", 5,
                             new String[]{"Vrlo korisna knjiga", "Pomaze mi da savladam Javu"}, "Programiranje"));

        knjizara.dodajKnjigu(new Roman("Put na mesec", "Zil Vern", 5,
                new String[]{"Prelepa!"}, "Avantura"));

        // Iteriranje kroz knjižaru i prikazivanje informacija o svakoj knjizi
        for (int i = 0; i < knjizara.knjige.size(); i++) {
            System.out.println("Informacije o knjizi:");
            Knjiga knjiga = knjizara.knjige.get(i);
            knjiga.prikaziInformacije();
            System.out.println();
        }

        // ispisivanje komentara za knjigu na indeksu 0
        knjizara.ispisiKomentare(2);
    }
}
