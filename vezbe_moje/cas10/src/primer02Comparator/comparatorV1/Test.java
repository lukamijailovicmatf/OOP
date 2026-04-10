package primer02Comparator.comparatorV1;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        List<Tacka> tacke = new ArrayList<>();

        tacke.add(new Tacka(2,3));
        tacke.add(new Tacka(2,5));
        tacke.add(new Tacka(3,1));
        tacke.add(new Tacka(-1,1));
        tacke.add(new Tacka(7,6));
        tacke.add(new Tacka(5,-7));
        tacke.add(new Tacka(-3,2));
        tacke.add(new Tacka(5,-6));

        // Konstruisemo komparator objekat koji ce se proslediti
        // funkciji za sortiranje. Na ovaj nacin, funkcija za
        // sortiranje zna da poredi elemente dok se bude
        // primenjivao algoritam za sortiranje.
        // Poredjenje se vrsi tako sto algoritam sortiranja
        // poziva metod 'compare' nad komparatorom kojem
        // prosledjuje elemente iz kolekcije koja se sortira.
        PorediPoXPaY poXPaY = new PorediPoXPaY();
        Collections.sort(tacke, poXPaY);

        System.out.println(tacke);
    }
}