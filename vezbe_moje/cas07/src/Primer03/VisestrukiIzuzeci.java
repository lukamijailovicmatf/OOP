package Primer03;

import java.util.Scanner;

public class VisestrukiIzuzeci {
    public static void main(String[] args) {

        int x = 10;
        int[] a = {1, 2, 3, 4, 5};
        Scanner sc = null;

        try{
            sc.nextLine(); // izbacuje izuzetak 'NullPointerException'
            x = 10/0;      // izbacuje izuzetak 'ArithmeticException'
            x = a[20];     // izbacuje izuzetak 'ArrayIndexOutOfBoundsException'
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Desila se greska ili 'ArithmeticException' ili 'ArrayIndexOutOfBoundsException'");
        }catch(Exception e){
            // Ukoliko zelimo da uhvatimo sve ostale izuzetke koji nisu navedeni
            // u prethodnim catch konstrukcijama, mozemo da navedemo 'Exception'
            // koji hvata sve izuzetke
            // Blok catch u sustini radi poredjenje koristeci operator 'instanceof'
            // (pogledati primer pod komentarom kako bi se to vestacki imitiralo).
            System.out.println("Doslo je do greske koju ne znamo...");
            System.out.println("Greska: " + e.getMessage());

            // Metod 'printStackTrace()' prikazuje trag steka od trenutka
            // kada je detektovana greska.
            e.printStackTrace();
        }finally{
            // Finally blok se uvek izvrsava i sluzi da zatvori koriscene resurse
            // koji se mozda nisu zatvorili u try bloku (jer je izvrsavanje stalo
            // usled prouzrokovane greske).
            if(sc != null)
                sc.close();
        }
    }
}
