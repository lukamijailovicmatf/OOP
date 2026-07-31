package zadatak3;

/* Klasa za testiranje */

import java.util.Optional;

public class Test {
    public static void main(String[] args) {

        /* Definisanje skupova s1 i s2 */
        MatematickiSkup<Osoba> s1 = new MatematickiSkup<>("s1", 5);
        s1.dodaj(new Osoba("Ana", "Anic"));
        s1.dodaj(new Osoba("Bojan", "Bojanic"));

        MatematickiSkup<Osoba> s2 = new MatematickiSkup<>("s2", 5);
        s2.dodaj(new Osoba("Ceca", "Cecic"));
        s2.dodaj(new Osoba("Ana", "Anic"));

        /* Ispis skupova */
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        /* Odredjivanje unije skupova s1 i s2 */
        MatematickiSkup<Osoba> unija = s1.unija(s2);
        System.out.println("Unija s1 i s2: " + unija);

        /* Odredjivanje maksimuma u uniji */
        Optional<Osoba> maksimum = unija.nadjiMaksimum();
        if (maksimum.isPresent()) {
            System.out.println("Maksimum u uniji: " + maksimum.get());
        } else {
            System.out.println("Maksimum ne postoji u uniji.");
        }
    }
}