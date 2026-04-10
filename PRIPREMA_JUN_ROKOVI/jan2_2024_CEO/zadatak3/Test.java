package org.example.jan2_2024_ceo.zadatak3;

public class Test {
    public static void main(String[] args) {

        Osoba[] niz_osoba1 = new Osoba[4];
        niz_osoba1[0] = new Osoba("Marija", "Djeric");
        niz_osoba1[1] = new Osoba("Vukan", "Ivic");
        niz_osoba1[2] = new Osoba("Uros", "Krivokapic");
        niz_osoba1[3] = new Osoba("Djordje", "Savic");

        MatematickiSkup<Osoba> s1 = new MatematickiSkup<>("Maturanti", niz_osoba1,4, Osoba.poredi);

        Osoba[] niz_osoba2 = new Osoba[3];
        niz_osoba2[0] = new Osoba("Petar", "Urosevic");
        niz_osoba2[1] = new Osoba("Marko", "Markovic");
        niz_osoba2[2] = new Osoba("Dimitrije", "Stankovic");

        MatematickiSkup<Osoba> s2 = new MatematickiSkup<>("Apsolventi", niz_osoba2,3, Osoba.poredi);

        System.out.println(s1);
        System.out.println(s2);

        MatematickiSkup<Osoba> unija = s1.unija(s2);
        System.out.println(unija);

        if (unija.nadjiMaksimum().isPresent()) {
            System.out.println(unija.nadjiMaksimum().get());
        } else {
            System.out.println("Ne postoji");
        }
    }
}
