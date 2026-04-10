package Primer03Set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Primer02SkupovneOperacije {
    public static void main(String[] args) {

        // Skupovi u Javi omogucavaju i skupovne operacije, no skupovne operacije
        // nisu date kao metodi eksplicitno.
        Set<Integer> S1 = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> S2 = new TreeSet<>(Arrays.asList(4, 5, 6, 7, 8));

        System.out.println("S1: " + S1);
        System.out.println("S2: " + S2);

        // Unija skupova
        Set<Integer> S1unijaS2 = new TreeSet<>(S1);
        S1unijaS2.addAll(S2);
        System.out.println("S1 U S2: " + S1unijaS2);

        // Presek skupova
        Set<Integer> S1presekS2 = new TreeSet<>(S1);
        S1presekS2.retainAll(S2);
        System.out.println("S1 ∩ S2: " + S1presekS2);

        // Razlika skupova
        Set<Integer> S1razlikaS2 = new TreeSet<>(S1);
        S1razlikaS2.removeAll(S2);
        System.out.println("S1 \\ S2: " + S1razlikaS2);
    }
}
