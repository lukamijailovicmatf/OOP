package Primer04TreeMap;

import java.util.*;

public class Ocene {
    public static void main(String[] args) {

        Map<String, List<Integer>> bodovi = new TreeMap<>();

        bodovi.put("Marko Markovic", new ArrayList<>(Arrays.asList(6, 7, 8, 9)));
        bodovi.put("Stefan Stefanovic", new ArrayList<>(Arrays.asList(10, 10, 10, 10)));
        bodovi.put("Nemanja Nemanjic", new ArrayList<>(Arrays.asList(9, 10, 10, 10)));
        bodovi.put("Ana Anic", new ArrayList<>(Arrays.asList(9, 10, 10, 10)));
        bodovi.put("Nina Ninic", new ArrayList<>(Arrays.asList(6, 8, 8, 10)));
        bodovi.put("Mirjana Miric", new ArrayList<>(Arrays.asList(8, 8, 8, 10)));

        Map<String, Float> proseci = new TreeMap<>();

        for (Map.Entry<String, List<Integer>> element: bodovi.entrySet()) {
            // element.getKey() - uzima kljuc mape
            String ime = element.getKey();
            float prosek = 0;

            // element.getValue() - prolazimo kroz listu ocena
            for (Integer ocena: element.getValue())
                prosek = prosek + ocena;

            // element.getValue().size() - koliko ocena ima u listi ocena za svakog studenta
            prosek = prosek / element.getValue().size();

            // u mapu 'proseci' stavljamo ime studenta i njegov prosek
            proseci.put(ime, prosek);
        }

        for (Map.Entry<String, Float> prosek: proseci.entrySet())
            System.out.println(prosek.getKey() + ": " + prosek.getValue());
    }
}
