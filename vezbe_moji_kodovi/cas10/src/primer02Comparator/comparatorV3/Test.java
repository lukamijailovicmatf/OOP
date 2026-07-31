package primer02Comparator.comparatorV3;

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

        // Primetimo da u spoljasnjem svetu, izmene u klasi Tacka
        // se sada ne odrazavaju, odnosno korisnik ne zna kako
        // smo implementirali komparator, i kod iz proslog paketa
        // ne moramo uopste da menjamo.
        Collections.sort(tacke, Tacka.porediPoXPaY);
        System.out.println(tacke);
    }
}
