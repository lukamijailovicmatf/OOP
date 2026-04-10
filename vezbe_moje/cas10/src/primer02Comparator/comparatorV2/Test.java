package primer02Comparator.comparatorV2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

        // Ne svidja nam se da korisnik bude primoran da
        // instancira objekat kada god zeli da sortira tacke,
        // te podizemo nivo enkapsulacije i apstrakcije tako
        // sto komparator premestamo u klasu 'comparatorV2.Tacka'.
        // Osim toga, zelimo da obezbedimo da postoji najvise
        // jedan objekat komparatora, a ne da se objekat
        // instancira svaki put kada se zeli poredjenje.
        // Dodatno, sakrili smo klasu 'PorediPoXPaY' od spoljasnjeg
        // sveta jer je ona sada umetnuta u klasu
        // 'comparatorV2.Tacka' kao privatna.
        Collections.sort(tacke, Tacka.porediPoXPaY);
        System.out.println(tacke);
    }
}
