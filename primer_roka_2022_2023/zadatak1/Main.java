package zadatak1;

public class Main {
    public static void main(String[] args) {

        // kreiramo niz koji sadrzi geometrijske figure tj. kreiramo niz geometrijskih figura
        GeometrijskaFigura[] figure = {new Kvadrat("kv1", 10), new Krug("k1", 10), new Pravouogaonik("p1", 10, 5)};

        // pozivamo konstruktor iz klase GeometrijskiSkup i kreiramo instancu klase GeometrijskiSkup
        // tako sto mu prosledjujemo niz figura koji smo vec napravili iznad
        GeometrijskiSkup gs = new GeometrijskiSkup(figure);

        System.out.println("Ukupna povrsina: " + gs.ukupnaPovrsina());

        for (GeometrijskaFigura gf : gs.getNizFigura()) {
            gf.prikazi();
        }
    }
}
