import java.util.Scanner;

public class Primer02 {

    /* Unos i ispis niza koristeci funkcije */
    static void ispisi1(int[] a){

        System.out.println("Uneti brojevi (for petlja):");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();

    }

    static void ispisi2(int[] a){

        System.out.println("Uneti brojevi (foreach petlja):");
        for(int e: a)
            System.out.print(e + " ");
        System.out.println();

    }

    static int[] unesi(){

        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite velicinu niza:");
        int n = ulaz.nextInt();

        int[] tmp = new int[n];
        System.out.println("Unesite elemente niza:");
        for (int i = 0; i < n; i++)
            tmp[i] = ulaz.nextInt();

        return tmp;

    }

    public static void main(String[] args) {

        int[] a = unesi();
        ispisi1(a);
        ispisi2(a);

    }

}
