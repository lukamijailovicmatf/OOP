import java.util.Scanner;

public class Primer06 {

    /* Program unosi matricu, a potom vrsi obrtanje i-te i j-te vrste */
    static Scanner ulaz = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] a = unesi();

        System.out.println("Unesite indekse vrsta koje zelite da razmenite:");
        int i = unesiSiguranInt();
        int j = unesiSiguranInt();

        // Proveravamo da li su uneti indeksi validnih vrsta
        if(i < 0 || i >= a.length || j < 0 || j > a.length){
            System.out.println("Indeks vrste mora biti izmedju 0 i " + (a.length-1));
            System.exit(1);
        }

        System.out.println("Pre razmene vrsta " + i + " i " + j);
        ispisi(a);

        System.out.println("\nPosle razmene:");
        razmeniEfikasno(a, i, j);
        ispisi(a);
    }

    static void ispisi(int[][] a){
        for(int[] tmp: a){
            for(int e: tmp)
                System.out.print(e + " ");
            System.out.println();
        }
    }

    /* Posto je matrica niz nizova, a mi na niz imamo referencu, nista nas ne sprecava da jednostavno
       "prevezemo" reference odgovarajucih vrsta u nasoj matrici */
    // Vremenska slozenost: O(1)
    // Prostorna slozenost: O(1)
    static void razmeniEfikasno(int[][] a, int i, int j){
        int[] tmp = a[i];  // cuvamo referencu na i-tu vrstu
        a[i] = a[j];
        a[j] = tmp;
    }

    public static int unesiSiguranInt(){
        if((ulaz.hasNextInt())){
            return ulaz.nextInt();
        }else{
            System.out.println("Niste uneli ceo broj...");
            System.exit(1);
            return 1;  // nije neophodno, ali java ipak zahteva da vratimo nesto
        }
    }

    static int[][] unesi(){
        System.out.println("Unesite dimenzije matrice:");
        int n = unesiSiguranInt();
        int m = unesiSiguranInt();

        int[][] a = new int[n][m]; // pravimo matricu

        // unosimo matricu
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = unesiSiguranInt();

        return a;
    }

}
