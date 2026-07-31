package Primer01;

public class CovekIzEngleske extends Covek implements EngleskiJezik{
    public CovekIzEngleske(String ime, String prezime, int godine){
        // poziva se konstruktor nadklase (Covek): Covek(String ime, String prezime, int godine)
        super(ime, prezime, godine);
    }

    public void hello(){
        System.out.println("hello");
    }

    public void goodbye(){
        System.out.println("goodbye");
    }
}
