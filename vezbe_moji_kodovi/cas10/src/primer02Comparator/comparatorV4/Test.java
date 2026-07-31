package primer02Comparator.comparatorV4;

import primer02Comparator.comparatorV1.PorediPoXPaY;

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

        Collections.sort(tacke, Tacka.porediPoXPaY);
        System.out.println("Sortiranje po X pa po Y: ");
        System.out.println(tacke);

        Collections.sort(tacke, Tacka.porediPoYPaX);
        System.out.println("Sortiranje po Y pa po X: ");
        System.out.println(tacke);
    }
}
