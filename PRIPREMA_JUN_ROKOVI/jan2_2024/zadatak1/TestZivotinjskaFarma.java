package zadatak1;

import java.util.Scanner;

public class TestZivotinjskaFarma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Svinja svinja = new Svinja("Napoleon");

        // Unos podataka za ovce
        System.out.println("Unesite broj recenica za ovce:");
        int brojRecenica = sc.nextInt();
        String[] paroleOvce = new String[brojRecenica];
        System.out.println("Unesite recenice za ovce:");
        for (int i = 0; i < brojRecenica; i++) {
            paroleOvce[i] = sc.next();
        }

        Ovca moli = new Ovca("Moli", paroleOvce);
        Ovca poli = new Ovca("Poli", paroleOvce);

        // Ispis podataka o svinji
        System.out.println(svinja);

        // Poziv metoda uglas() za ovce
        moli.uglas();
        poli.uglas();

        // Naredba za Poli
        Direktiva direktiva = new Direktiva("Poli", "CETIRI NOGE DOBRE, DVE BOLJE");
        poli.naredi(direktiva);

        // Ispis rezultata za Poli
        System.out.println(poli);

        // Promena parole za svinju
        svinja.setParola("Sve su zivotinje jednake, ali su neke jednakije od drugih");

        // Ispis ponovo za svinju
        System.out.println(svinja);
    }
}
