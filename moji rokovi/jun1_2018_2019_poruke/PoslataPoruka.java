package com.example.jun1_2018_2019_poruke.zadatak1;

public class PoslataPoruka extends Poruka {

    private String primalac;

    public PoslataPoruka(String tekstPoruke, String datum, String primalac) {
        super(tekstPoruke, datum);
        this.primalac = primalac;
    }

    @Override
    public String sacuvajPoruku() {
        // s; datum; primalac; tekstPoruke
        return "s; " + getDatum() + "; " + primalac + "; " + getTekstPoruke();
    }

    @Override
    public String toString() {
        // Primalac: ime datum
        // tekstPoruke
        return "Primalac: " + primalac + super.toString();
    }

    @Override
    public int compareTo(Poruka o) {
        //
        if (o instanceof PrimljenaPoruka)
            return 1;

        return this.getDatum().compareTo(o.getDatum());
    }
}
