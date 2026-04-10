package Primer04TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Bodovi {

    /*
        Struktura podataka 'Map' nam omogucava da napravimo
        preslikavanje K -> V, gde su:
            - K -> kljuc (eng. key)
            - V -> vrednost (eng. value)
        Ovakva struktura podataka se u praksi intenzivno koristi za
        citanje podataka iz baza podataka, cuvanje retkih matrica,
        cuvanje grafova...).
    */
    public static void main(String[] args) {

        Map<String, Integer> bodovi = new TreeMap<>();

        bodovi.put("Marko Markovic", 85);
        bodovi.put("Stefan Stefanovic", 101);
        bodovi.put("Nemanja Nemanjic", 100);
        bodovi.put("Ana Anic", 97);
        bodovi.put("Nina Ninic", 96);
        bodovi.put("Jovana Jovanovic", 80);

        System.out.println("Studenti koji su polagali OOP: ");

        // Iteriranje kroz skup kljuceva
        for (String kljuc: bodovi.keySet())
            System.out.println("- " + kljuc);

        int suma = 0;
        for (Integer bod: bodovi.values())
            suma = suma + bod;

        double prosek = 1.0 * suma / bodovi.values().size();
        System.out.println("Prosek poena: " + prosek);

        // Iteriranje kroz skup unosa mape
        for (Map.Entry<String, Integer> element: bodovi.entrySet()) {
            System.out.print("Student: " + element.getKey());
            System.out.println(", bodovi: " + element.getValue());
        }
    }
}