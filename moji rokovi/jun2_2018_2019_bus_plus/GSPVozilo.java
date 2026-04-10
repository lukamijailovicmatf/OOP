package com.example.jun2_2018_2019_bus_plus.zadatak1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class GSPVozilo {

    private Map<Integer, BusPlus> kartice;
    private List<Integer> nevalidne; // lista id-eva nevalidnih kartica

    private static Random random = new Random();
    private static int noviId = 10000;

    public GSPVozilo() {
        this.kartice = new TreeMap<>();
        this.nevalidne = new ArrayList<>();
    }

    List<BusPlus> getKartice() {
        return new ArrayList<>(kartice.values());
    }

    public boolean putniciUVozilu(String putanja) {
        try {
            // sve linije iz fajla smestamo u jednu listu stringova
            List<String> linije = Files.readAllLines(Paths.get(putanja));
            // koristimo kolekcijsku petlju za prolazak kroz listu
            for (String linija: linije) {
                // pravimo niz String-ova tako sto koristimo split
                String[] delovi = linija.split(", ");
                int id = Integer.parseInt(delovi[1].trim());
                int zona = Integer.parseInt(delovi[2].trim());

                if (delovi[0].equals("P")) {
                    String kategorija = delovi[3].trim();
                    String imaDopunu = delovi[4].trim();
                    kartice.put(id, new Personalizovana(id, zona, Kategorija.valueOf(kategorija),
                            (imaDopunu.equals("da") ? true : false)));
                } else {
                    String kredit = delovi[3].trim();
                    String ocitana = delovi[4].trim();
                    kartice.put(id, new Nepersonalizovana(id, zona, Integer.parseInt(kredit),
                            (ocitana.equals("+") ? true : false)));
                }
            }
            return true;
        } catch (IOException e){
            return false;
        }
    }

    public BusPlus noviPutnik(int vrstaKartice) {
        // inicijalizujemo objekat koji na kraju vracamo
        BusPlus novaKartica = null;
        if (vrstaKartice == 1) {
            int kategorija = random.nextInt(Kategorija.values().length);
            boolean imaDopunu = random.nextBoolean();
            novaKartica = new Personalizovana(noviId, vrstaKartice, Kategorija.izBroja(kategorija), imaDopunu);
        } else {
            int kredit = random.nextInt(2 * Nepersonalizovana.cenaVoznje + 1);
            novaKartica = new Nepersonalizovana(noviId, vrstaKartice, kredit, false);
            // vrsimo ocitavanje karte
            ((Nepersonalizovana) novaKartica).ocitajKartu();
        }
        kartice.put(noviId, novaKartica);
        noviId++;
        return novaKartica;
    }

    public String kontrola() {
        StringBuilder sb = new StringBuilder();
        // kolekcijskom petljom prolazimo kroz mapu
        for (Map.Entry<Integer, BusPlus> e: kartice.entrySet()) {
            // uzimamo tip karte i popunjavamo format ispisa
            BusPlus k = e.getValue();
            if (k instanceof Personalizovana) {
                if (((Personalizovana) k).imaDopunu()) {
                    sb.append("+");
                } else {
                    sb.append("-");
                    // nevalidne kartice ubacujemo u listu nevalidnih kartica
                    nevalidne.add(e.getKey());
                }
            } else if (k instanceof Nepersonalizovana) {
                if (((Nepersonalizovana) k).isOcitana()) {
                    sb.append("+");
                } else {
                    sb.append("-");
                    nevalidne.add(e.getKey());
                }
            }
            sb.append(' ');
            sb.append(k.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public boolean izbaciPutnike() {
        if (nevalidne.isEmpty())
            return false;

        // kolekcijskom petljom sada prolazimo kroz listu i trazimo koje treba da izbacimo
        for (Integer id: nevalidne)
            kartice.remove(id);

        return true;
    }
}
