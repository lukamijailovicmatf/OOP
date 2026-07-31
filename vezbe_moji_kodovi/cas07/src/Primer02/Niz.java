package Primer02;

public class Niz {

    private int[] a; // pravimo privatni niz int-ova

    // Konstruktor za niz, n je velicina niza
    public Niz(int n){
        a = new int[n];
    }

    // argument konstruktora je neki pomocni niz int-ova tmp
    public Niz(int[] tmp){
        a = new int[tmp.length]; // pravimo novi objekat date klase (kljucna rec new)
        for(int i = 0; i < tmp.length; i++)
            a[i] = tmp[i];
    }

    public int length(){
        return a.length;
    }

    // geter za dohvatanje nekog elementa niza
    public int get(int i){
        // Primer kako mozemo da "ispalimo" izuzetak kada detektujemo odredjenu gresku u nasem kodu
        if(i < 0 || i >= a.length)
            // throw new ArrayIndexOutOfBoundsException();
            // Ukoliko navedemo String u konstruktoru, taj string se vraca kada se nad izuzetkom pozove
            // metod 'getMessage'.
            throw new ArrayIndexOutOfBoundsException("Lose indeksiranje!");
        // Ispaljivanje ovog izuzetka prekida izvrsavanje funkcije
        return a[i];
    }

    @Override
    public String toString() {
        return java.util.Arrays.toString(a);
    }
}
