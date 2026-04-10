	package zadatak1;

public class Ovca extends Zivotinja {

    private String[] parole;
    private int index; // zbog ispisa parola
    private static int brojOvaca = 0;

    /* Konstruktor klase Ovca */
    public Ovca(String ime, String[] parole) {
        super(ime);
        this.parole = parole;
        this.index = 0;
        brojOvaca++;
    }

    /* Konstruktor kopije */
    public Ovca(Ovca ovca) {
        this(ovca.ime, ovca.parole);
        this.index = ovca.index;
        brojOvaca++;
    }

    /* Metod koji ispisuje trenutnu parolu na stdout onoliko puta koliko ima ovaca */
    public void uglas() {
        for (int i = 0; i < brojOvaca; i++) {
            System.out.println(parole[index]);
        }
    }

    /* Metod koji menja parolu ukoliko je ime ovce u direktivi */
    public void naredi(Direktiva d) {
        if (d.getImeOsobe().equals(this.ime)) {
            this.parole = new String[]{d.getNaredba()};
        }
    }

    /* Getter za parolu (potrebno zbog nasledjivanja) */
    public String[] getParole() {
        return parole;
    }

    public void setParole(String[] parole) {
        this.parole = parole;
    }

    /* Predefinisana metoda toString za ispis */
    @Override
    public String toString() {
        String parola = this.parole[index];
        index = (index + 1) % this.parole.length;
        return "Ovca kaze: " + parola;
    }
}
