import java.util.Arrays;
import java.util.Scanner;

public class Primer03 {

    /* Evo primera kako mozemo napraviti globalnu promenljivu. Primetimo da je mozemo inicijalizovati. */
    static Scanner ulaz = new Scanner(System.in);

    /* Program unosi niz, a potom mnozi svaki element niza konstantom c koju unese korisnik */
    public static void main(String[] args) {

        int[] a = unesi();

        System.out.println("Unesite celobrojnu konstantu kojom mnozite niz:");
        int c = ulaz.nextInt();

        System.out.println("Uneti niz:");
        ispisi(a);

        pomnoziKonstantom(a, c);

        System.out.println("Promenjeni niz:");
        ispisi(a);

    }

    static void pomnoziKonstantom(int[] a, int c){

        /* Ne mozemo koristiti obicnu foreach petlju jer ona kopira primitivne tipove tako da nase mnozenje
           ne bi menjalo elemente niza 'a' */
        // for(int e: a)
        //    e *= c;
        for (int i = 0; i < a.length; i++)
            a[i] = a[i] * c;
    }

    private static void ispisi(int[] a){
        for(int e: a)
            System.out.print(e + " ");
        System.out.println();
    }

    static int[] unesi(){
        ulaz = new Scanner(System.in);
        System.out.println("Unesite velicinu niza:");
        int n = ulaz.nextInt();

        System.out.println("Unesite elemente niza:");
        int[] tmp = new int[n]; // pravim niz
        for (int i = 0; i < n; i++)
            tmp[i] = ulaz.nextInt();

        return tmp;

    }

}
