package org.example.jan2_2024_ceo.zadatak1;

import java.util.Scanner;

public class TestZivotinjskaFarma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Svinja svinja = new Svinja("Napoleon");

        System.out.println("Unesite broj parola za ovce:");
        int brojParola = sc.nextInt();
        String[] parole = new String[brojParola];
        for (int i = 0; i < brojParola; i++) {
            parole[i] = sc.next();
        }

        Ovca moli = new Ovca("Moli", parole);
        Ovca poli = new Ovca("Poli", parole);

        // ispis za svinju
        System.out.println(svinja);

        // metod uglas() za obe ovce
        moli.uglas();
        poli.uglas();

        // naredba za poli
        poli.naredi(new Direktiva("Poli", "CETIRI NOGE DOBRE, DVE BOLJE"));

        // ispis za poli
        System.out.println(poli);

        // promena parole za svinju
        svinja.setParola("Sve su zivotinje jednake, ali su neke jednakije od drugih");

        // ispis za svinju
        System.out.println(svinja);
    }
}
