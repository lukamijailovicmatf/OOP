package Primer04TreeMap;

/* Napisati program koji iz datoteke 'input.txt' prebrojava pojavljivanja svih reci. */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BrojanjeReci {
    public static void main(String[] args) {

        // pravimo mapu koja svakoj reci dodeljuje broj pojavljivanja
        Map<String, Integer> ponavljanjeReci = new TreeMap<>();

        Path ulaznaPutanja = Paths.get("input.txt");
        System.out.println("Ucitavamo datoteku: " + ulaznaPutanja.toAbsolutePath());

        try {
            // citamo sve linije iz datoteke i smestamo u listu
            List<String> linije = Files.readAllLines(ulaznaPutanja);

            // prolazimo liniju po liniju
            for (String linija: linije) {
                // izdvajamo reci
                String[] reci = linija.split(" ");
                for (String rec: reci) {
                    // trazimo rec u mapi
                    Integer broj = ponavljanjeReci.get(rec);
                    // ako ne postoji trazeni kljuc 'get' vraca null
                    if (broj == null) {
                        // 'put' dodaje novi kljuc u mapu sa zadatom vrednoscu, ako kljuc ne postoji
                        ponavljanjeReci.put(rec, 1);
                    } else {
                        // 'put' postavlja novu vrednost za zadati kljuc, ako se kljuc nalazi u mapi
                        ponavljanjeReci.put(rec, broj+1);
                    }
                }
            }

        } catch (IOException e) {
            System.err.println("Neuspesno citanje datoteke: " + ulaznaPutanja.getFileName());
            e.printStackTrace();
        }

        for (Map.Entry<String, Integer> element: ponavljanjeReci.entrySet())
            System.out.println(element.getKey() + ": " + element.getValue());
    }
}
