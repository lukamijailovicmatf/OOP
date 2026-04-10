package Primer01;

import java.io.Serializable;

/* Izuzetak - objekat koji sadrzi informacije o gresci koja se desila.
*  Posto je objekat, izuzetak je instanca neke klase.
*  Izuzetak se "ispaljuje" ili "baca", a ako bi nesto moglo biti
*  "ispaljeno" ili "baceno", mora biti instanca klase Throwable.
*  Sa druge strane, izuzetak se "hvata" (eng. catch), i kada se izuzetak uhvati,
*  reagujemo na njega (npr. prijavljujemo gresku).
*/
public class Main {
    public static void main(String[] args){

        int x = 10;

        try{
            // Pokusavamo "rizicnu" radnju
            System.out.println(x/0);
            System.out.println("Ova naredba se ne izvrsava");
            System.out.println("A ni ova");
        } catch (ArithmeticException e){
            // Ukoliko je nasa radnja prouzrokovala izbacivanje izuzetka tipa 'ArithmeticException'
            // catch blok se bavi reakcijom na tu gresku (na primer obavestava korisnika da je doslo do
            // greske, mozda izlazi iz programa, formatira korisnikov hard disk :) ili slicno)
            System.err.println("Deljenje nulom");

            System.out.println("------------------------------------------------------------");

            System.out.println("e.getMessage(): " + e.getMessage());
            System.err.println("e.toString(): " + e.toString());
            System.out.println("e.getLocalizedMessage(): " + e.getLocalizedMessage());
            System.out.println("------------------------------------------------------------");
        }
    }
}