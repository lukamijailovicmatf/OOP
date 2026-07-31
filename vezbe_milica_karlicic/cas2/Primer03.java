import java.util.Scanner;

public class Primer03 {

    static int[] ucitaj() {
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();

        int[] niz = new int[n];

        for (int i = 0; i < n; i++)
            niz[i] = ulaz.nextInt();

        return niz;
    }

    static void ispisi(int[] niz) {
        for (int element: niz)
            System.out.print(element + " ");
        System.out.println();
    }

    static void pomnoziKonstantom(int[] niz, int konstanta) {
        for (int i = 0; i < niz.length; i++)
            niz[i] = niz[i] * konstanta;
    }

    public static void main(String[] args) {
        int[] niz = ucitaj();
        ispisi(niz);
        pomnoziKonstantom(niz, 5);
        ispisi(niz);
    }
}

