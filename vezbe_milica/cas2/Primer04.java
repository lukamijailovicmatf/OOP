import java.util.Arrays;

public class Primer04 {

    static void ispisi1(int[][] matrica) {
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[i].length; j++) {
                System.out.print(matrica[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void ispisi2(int[][] matrica) {
        for (int[] vrsta: matrica) {
            for (int element: vrsta) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void ispisi3(int[][] matrica) {
        System.out.println(Arrays.deepToString(matrica));
    }

    public static void main(String[] args) {

        int[][] matrica = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        ispisi1(matrica);
        ispisi2(matrica);
        ispisi3(matrica);
    }
}

