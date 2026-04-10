package org.example.jan2_2024_ceo.zadatak1;

public class Ovca extends Zivotinja {

    private String[] parole;
    private int indeks;
    private static int brojOvaca = 0;

    // konstruktor
    public Ovca(String ime, String[] parole) {
        super(ime);
        this.parole = parole;
        this.indeks = 0;
        brojOvaca++;
    }

    // konstruktor kopije
    public Ovca(Ovca o) {
        this(o.getIme(), o.parole);
        this.indeks = 0;
        brojOvaca++;
    }

    public String[] getParole() {
        return parole;
    }

    public void setParole(String[] parole) {
        this.parole = parole;
    }

    public void uglas() {
        for (int i = 0; i < brojOvaca; i++) {
            System.out.println(parole[indeks]);
        }
    }

    public void naredi(Direktiva d) {
        if (d.getImeOsobe().equals(this.getIme())) {
            this.parole = new String[]{d.getNaredba()};
        }
    }

    @Override
    public String toString() {
        String parola = parole[indeks];
        indeks = (indeks + 1) % parole.length;
        return "Ovca kaze: " + parola;
    }
}
