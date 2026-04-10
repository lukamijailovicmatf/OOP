package com.example.jun2_2017_2018.zadatak1;

public abstract class ObjekatIgre implements Comparable<ObjekatIgre> {

    private String naziv;
    protected int X;
    protected int Y;

    public ObjekatIgre(String naziv, int X, int Y) {
        this.naziv = naziv;
        this.X = X;
        this.Y = Y;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public abstract void izvrsiAkciju();

    // [X,Y] naziv
    // [4,5] Indiana Jones
    @Override
    public String toString() {
        return "[" + X + ", " + Y + "] " + naziv;
    }

    // prvo idu rudnici pa onda tragaci
    public int compareTo(ObjekatIgre o) {
        if (this instanceof Tragac && o instanceof Rudnik) {
            return 1;
        } else if (this instanceof Rudnik && o instanceof Tragac) {
            return -1;
        } else if (this instanceof Rudnik && o instanceof Rudnik) {
            return Integer.compare(((Rudnik) this).getOtvorenJos(), ((Rudnik) o).getOtvorenJos());
        } else if (this instanceof Tragac && o instanceof Tragac) {
            return Double.compare(((Tragac) o).getRanac().getSlobodnoTezine(), ((Tragac) this).getRanac().getSlobodnoTezine());
        } else {
            // ovo ne treba da se desi!!!
            return Integer.compare(((Rudnik) this).getOtvorenJos(), ((Rudnik) o).getOtvorenJos());
        }
    }
}
