package com.example.jun1_2018_2019_poruke.zadatak1;

public class Datum {

    private int dan;
    private int mesec;
    private int godina;

    public Datum(String datum) {
        this.dan = Integer.parseInt(datum.substring(0, 2));
        this.mesec = Integer.parseInt(datum.substring(3, 5));
        this.godina = Integer.parseInt(datum.substring(6, 10));
    }

    public int getDan() {
        return dan;
    }

    public int getMesec() {
        return mesec;
    }

    public int getGodina() {
        return godina;
    }

    public String dvocifrenBroj(int i) {
        if (i > 9)
            return "" + i;
        else
            return "0" + i;
    }

    @Override
    public String toString() {
        return dvocifrenBroj(dan) + "." + dvocifrenBroj(mesec) + "." + dvocifrenBroj(godina);
    }

    public int compareTo(Datum o) {
        // prvo idu novije poruke pa onda idu starije poruke
        if (this.godina != o.godina)
            return o.godina - this.godina;
        else if (this.mesec != o.mesec)
            return o.mesec - this.mesec;
        else
            return o.dan - this.dan;
    }
}