package Izuzeci;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Primer03 {
    public static void main(String[] args) {

        String s = "Marko Markovic 20 9.5"; // pravimo nisku

        // try with resources - mozemo otvarati vise resursa
        // formatirano citanje iz stringa
        try (Scanner ulaz = new Scanner(System.in); Scanner ulazIzStringa = new Scanner(s)) {
            String ime = ulazIzStringa.next(); // citam ime
            String prezime = ulazIzStringa.next(); // citam prezime
            int godine = ulazIzStringa.nextInt(); // citam godine
            double prosek = ulazIzStringa.nextDouble(); // citam prosek

            System.out.println(ime + " " + prezime + " " + godine + " " + prosek); // ispis podataka
        } catch (ArithmeticException | InputMismatchException e) {
            // mozemo spojiti catch blokove ukoliko imaju iste naredbe
            System.out.println("desio se neki exception");
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("desilo se nesto sto nismo ocekivali");
            System.exit(1);
        }
    }
}
