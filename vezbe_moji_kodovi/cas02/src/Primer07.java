import java.util.Arrays;

public class Primer07 {

    /* Program prikazuje primer upotrebe funkcije za sortiranje i binarne pretrage */
    public static void main(String[] args) {

        int[] a = {10, 5, 3, 1, 7, 4, 2, 9, 6, 8};

        // Sortiramo
        // NAPOMENA: Ne moramo uvek da inportujemo klasu, mozemo jednostavno navesti njeno puno ime
        // U paketu java nalazi se paket util koji sadrzi klasu Arrays
        Arrays.sort(a);

        // Prikazujemo sortiran niz
        // Funkcija toString zna da prebaci JEDNOSTAVNE nizove u String
        System.out.println(Arrays.toString(a));

        // Vrsimo binarnu pretragu
        int x = 7;
        int i = Arrays.binarySearch(a, x);

        // Ako binarna pretraga vrati negativan broj onda element ne postoji u nizu
        if(i < 0)
            System.out.println(x + " ne postoji u nizu.");
        else
            System.out.println(x + " se nalazi na poziciji " + i);

        x = 42;
        i = Arrays.binarySearch(a, x);

        if(i < 0)
            System.out.println(x + " ne postoj u nizu.");
        else
            System.out.println(x + " se nalazi na poziciji " + i);

    }

}
