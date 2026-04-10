package Primer01;

public class CovekIzSrbije extends Covek implements EngleskiJezik,SrpskiJezik {
    public CovekIzSrbije(String ime, String prezime, int godine){
        // poziva se konstruktor nadklase (Covek): Covek(String ime, String prezime, int godine)
        super(ime, prezime, godine);
    }

    public void hello(){
        System.out.println("hello");
    }

    public void goodbye(){
        System.out.println("goodbye");
    }

    public void zdravo(){
        System.out.println("zdravo");
    }

    public void dovidjenja(){
        System.out.println("dovidjenja");
    }
}
