package PrimerTacka;

public class Main {
    public static void main(String[] args) {

        Tacka t1 = new Tacka(); // poziva se podrazumevani konstruktor za tacku
        Tacka t2 = new Tacka(0, 0); // poziva se konstruktor za tacku sa koordinatama (x, y)

        if(t1.jednake(t2)){
            System.out.println("jednake su");
        }else{
             System.out.println("nisu jednake");
        }

        System.out.println(t2);
        t2.transliraj(3, 4);
        System.out.println(t2);

        // nestaticka metoda
        System.out.println("rastojanje izmedju " + t1 + " i " + t2 + " je " + t1.rastojanje(t2));

        // staticka metoda
        System.out.println("rastojanje izmedju " + t1 + " i " + t2 + " je " + Tacka.rastojanje(t1, t2));

    }
}
