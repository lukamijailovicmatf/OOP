import java.util.Scanner;

public class Primer10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Unosimo jednu liniju teksta
        System.out.println("Unesite liniju teksta:");
        String ulaz = sc.nextLine(); // ucitava se cela linija do oznake za kraj reda
        // !!! sc.next() bi procitao samo prvu rec (do prve beline)

        // Brojimo pojavljivanja cifara, slova i belina
        int brCifara = 0;
        int brSlova = 0;
        int brBelina = 0;
        for(int i = 0; i < ulaz.length(); i++){ // length() -> duzina stringa
            // ako je i-ti karakter cifra
            if(Character.isDigit(ulaz.charAt(i)))
                brCifara++;
            // ... ili slovo
            else if(Character.isLetter(ulaz.charAt(i)))
                brSlova++;
            // ... ili belina
            else if(Character.isWhitespace(ulaz.charAt(i)))
                brBelina++;
        }

        System.out.println("Broj cifara: " + brCifara);
        System.out.println("Broj slova: " + brSlova);
        System.out.println("Broj belina: " + brBelina);

    }

}
