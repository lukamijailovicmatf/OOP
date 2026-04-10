package primer03instanceOf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {

        ArrayList<Oblik> oblici = new ArrayList<>();

        oblici.add(new Pravougaonik(new Tacka(2,3),1,20));
        oblici.add(new Krug(new Tacka(2,3),10));
        oblici.add(new Krug(new Tacka(1,5),50));
        oblici.add(new Pravougaonik(new Tacka(0,5),10,60));
        oblici.add(new Pravougaonik(new Tacka(0,5),10,40));
        oblici.add(new Krug(new Tacka(1,5),30));

        Collections.sort(oblici);

        for (Oblik o: oblici)
            System.out.println(o);
    }
}
