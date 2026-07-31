package Primer00;

import java.util.Arrays;
import java.util.Scanner;

public class SortiranjeStringa {
    public static void main(String[] args) {

        Scanner ulaz = new Scanner(System.in); // pravim novi Scanner kako bih citao sa ulaza
        String linija = ulaz.nextLine(); // u nisku linija ucitavamo ono sa ulaza

        System.out.println(linija); // na izlaz stampamo liniju koju smo uneli

        char[] pom = linija.toCharArray(); // svaki karakter unesene linije smestamo u niz
        Arrays.sort(pom); // sortiramo niz karaktera leksikografski

        linija = String.copyValueOf(pom); // u liniju kopiram karaktere iz niza pom
        System.out.println(linija); // stampam sortiranu liniju na izlaz

        ulaz.close(); // zatvaram Scanner

    }
}
