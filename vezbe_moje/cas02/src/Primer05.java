import java.util.Scanner;

public class Primer05 {

    public static void main(String[] args) {

        int[][] a = unesi();

        System.out.println("ispisi1(a):");
        ispisi1(a);

        System.out.println("ispisi2(a):");
        ispisi2(a);

    }

    private static int[][] unesi(){
        Scanner ulaz = new Scanner(System.in);

        System.out.println("Unesite dimenzije matrice (broj vrsta i broj kolona):");
        int n = ulaz.nextInt();
        int m = ulaz.nextInt();

        int[][] tmp = new int[n][m];
        System.out.printf("Unesite matricu dimenzije %dx%d\n", n, m);

        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                tmp[i][j] = ulaz.nextInt();

        return tmp;
    }

    static void ispisi1(int[][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++)
                System.out.printf("%d ", a[i][j]);
            System.out.println();
        }
    }

    static void ispisi2(int[][] a){
        for(int[] tmp: a) {
            for (int e : tmp)
                System.out.print(e + " ");
            System.out.println();
        }
    }

}
