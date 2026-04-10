package Primer02;

public class Main {
    public static void main(String[] args) {

        // pravimo niz od 4 elementa
        int[] tmp = {1, 2, 3, 4};

        // poziva se konstruktor: Niz(int[] tmp) i pravi se novi niz
        Niz niz = new Niz(tmp);

        System.out.println("niz[2] = " + niz.get(2));

        try{
            System.out.println("niz[100] = " + niz.get(100));
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());

            // Mozemo dobiti i trag steka (stack trace) koji ukljucuje redosled pozivanja funkcija
            // koje su dovele do ispavljivanja izuzetka, klasu i liniju u kojoj je ispaljen izuzetak
            // i slicno. Primetimo da ukoliko ne uhvatimo izuzetak, Java program upravo prikazuje
            // stackTrace i prestaje sa izvrsavanjem
            e.printStackTrace();
        }

        System.out.println("Velicina niza je: " + niz.length());
    }
}
