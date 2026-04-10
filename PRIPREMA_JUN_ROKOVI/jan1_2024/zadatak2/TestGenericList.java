package zadatak2;

public class TestGenericList {
    public static void main(String[] args) {
    
        // kreiranje instance GenericList za vektore u 3D prostoru
        GenericList<Vektor3D> vektori = new GenericList<>();

        // dodavanje nekoliko vektora u listu
        vektori.dodaj(new Vektor3D(1,2,3));
        vektori.dodaj(new Vektor3D(4,5,6));
        vektori.dodaj(new Vektor3D(1,2,3));
        vektori.dodaj(new Vektor3D(7,8,9));

        // ispisivanje svih elemenata liste
        System.out.println("Svi elementi liste:");
        vektori.ispisi();

        // kreiranje instance vektora koja ima iste koordinate kao neki koji je već u listi
        Vektor3D vektorUListi = new Vektor3D(1,2,3);

        // kreiranje instance vektora koji ne postoji u listi
        Vektor3D vektorNijeUListi = new Vektor3D(10,11,12);

        // testiranje poziva funkcije count na obe instance
        System.out.println("Broj pojavljivanja vektora " + vektorUListi + " u listi: " + vektori.count(vektorUListi));
        System.out.println("Broj pojavljivanja vektora " + vektorNijeUListi + " u listi: " + vektori.count(vektorNijeUListi));
    }
}
