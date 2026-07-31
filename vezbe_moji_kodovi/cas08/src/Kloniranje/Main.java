package Kloniranje;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{

        Pas p1 = new Pas("labrador", "Max", new Buva("pseca", "Marko"));
        Pas p2 = (Pas) p1.clone(); // u p2 je klon p1 tj. p2 == p1

        System.out.println(p1);
        System.out.println(p2);

        System.out.println("---------------------------------------------------");

        p2.getBuva().setIme("Bibi");
        System.out.println(p1);
        System.out.println(p2);
    }
}
