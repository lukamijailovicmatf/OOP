package primer02ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Primer01 {
    public static void main(String[] args) {

        /*
            Kako da inicijalizujemo kolekciju?
            Staticka funkcija 'asList' vraca 'ArrayList' objekat
            koji sadrzi prosledjene argumente kao elemente liste.
        */
        List<Integer> x = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Mozemo obrnuti kolekciju.
        Collections.reverse(x);
        System.out.println("Nakon obrtanja (iterator): ");
        Iterator<Integer> it = x.iterator();
        while (it.hasNext())
            System.out.print(it.next() + " ");
        System.out.println();

        System.out.println("Nakon obrtanja (foreach petlja): ");
        for (Integer element: x)
            System.out.print(element + " ");
        System.out.println();

        // Mozemo da promesamo elemente.
        Collections.shuffle(x);
        System.out.println("Nakon mesanja elemenata: ");
        System.out.println(x + " ");

        // Razmena elemenata.
        int i = 0;
        int j = 5;
        Collections.swap(x, i, j);
        System.out.println("Razmena elemenata na indeksima " + i + " i " + j);
        System.out.println(x + " ");

        // Trazenje minimuma i maksimuma.
        Integer maksimum = Collections.max(x);
        Integer minimum = Collections.min(x);
        System.out.println("Maksimum: " + maksimum);
        System.out.println("Minimum: " + minimum);

        // Rotiranje elemenata za k.
        System.out.println("Nakon rotacije za 3 mesta udesno: ");
        // rotiramo udesno za 3 pozicije
        Collections.rotate(x, 3);
        System.out.println(x);

        // rotiramo ulevo za 3 pozicije
        Collections.rotate(x, -3);
        System.out.println("Nakon rotacije za 3 mesta ulevo: ");
        System.out.println(x);

        /*
			Mozemo sortirati kolekciju. Neophodno je da postoji
			nacin poredjenja za klasu cije objekte cuvamo u
			kolekciji.
			Klasa Integer ima implementiran nacin poredjenja pa ne
			moramo nista da dodajemo.
		*/
        Collections.sort(x);
        System.out.println("Nakon sortiranja: ");
        System.out.println(x);
    }
}
