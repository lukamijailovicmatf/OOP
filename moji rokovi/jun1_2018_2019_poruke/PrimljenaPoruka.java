package com.example.jun1_2018_2019_poruke.zadatak1;

public class PrimljenaPoruka extends Poruka {

    private String posiljalac;
    private boolean procitano;

    public PrimljenaPoruka(String tekstPoruke, String datum, String posiljalac, boolean procitano) {
        super(tekstPoruke, datum);
        this.posiljalac = posiljalac;
        this.procitano = procitano;
    }

    @Override
    public String sacuvajPoruku() {
        // r; datum; posiljalac; tekstPoruke; procitano
        return "r; " + getDatum() + "; " + posiljalac + "; " + getTekstPoruke() + "; "
                + (procitano ? "da" : "ne");
    }

    @Override
    public String toString() {
        // Posiljalac: Ljubica (neprocitano) 12.06.2019.
        // Hvala!
        return "Posiljalac " +  posiljalac + "; " + (procitano ? "" : " (neprocitano) ") + super.toString();
    }

    @Override
    public int compareTo(Poruka o) {
        // prvo idu primljene pa onda poslate poruke
        if (o instanceof PoslataPoruka)
            return -1;

        // ako ima vise primljenih onda se sortiraju tako da idu neprocitane pa onda procitane poruke
        if (this.procitano && !((PrimljenaPoruka) o).procitano)
            return 1;
        else if (this.procitano && ((PrimljenaPoruka) o).procitano)
            return -1;
        else
            return this.getDatum().compareTo(o.getDatum());
    }
}
