package primer01LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Primer01 {
    public static void main(String[] args) {

        // LinkedList - dvostruko povezana lista
        LinkedList<String> imena = new LinkedList<>(Arrays.asList("Blue ranger", "Red ranger", "White ranger", "Zordon", "Yellow ranger"));

        // Kroz listu mozemo da iteriramo kolekcijskom petljom
        System.out.println("Sadrzaj liste (foreach petlja):");
        for (String ime: imena)
            System.out.print(ime + " ");
        System.out.println("\n");

        // Mozemo i starom dobrom for petljom
        // No ovo je lose, metod 'get' mora da krene od pocetka liste
        // kako bi dosao do i-tog elementa!!!
        System.out.println("Sadrzaj liste (stari dobri for):");
        for (int i = 0; i < imena.size(); i++)
            System.out.print(imena.get(i) + " ");
        System.out.println("\n");

        // Lista se moze ispisati na standardni izlaz i na sledeci nacin,
        // toString() metod se poziva implicitno
        System.out.println("Sadrzaj liste (toString):");
        System.out.println(imena);
        System.out.println();

        // Lista omogucava i da dodajemo i citamo elemente sa pocetka i kraja
        imena.addLast("Rita");
        imena.addFirst("Alpha 5");
        System.out.println("Nakon dodavanja na pocetak i kraj: " + imena);

        // Mozemo i uklanjati elemente
        imena.removeFirst();
        imena.removeLast();
        System.out.println("Nakon uklanjanja sa pocetka i kraja: " + imena);

        // Mozemo i ukloniti i-ti element
        System.out.println("Nakon uklanjanja elementa: " + imena.get(3));
        imena.remove(3);
        System.out.println(imena);

        int velicina = imena.size();
        System.out.println("Velicina liste je: " + velicina);

        imena.add("Luka");
        System.out.println("Nakon dodavanja Luka: " + imena);

        try {
            String element = imena.get(5);
            System.out.println("Peti element po redu u listi je: " + element);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
