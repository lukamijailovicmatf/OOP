package vesala;

public class LjudskiIgrac extends Igrac {

    private char izabranoSlovo;

    public LjudskiIgrac(String ime, int nivo, int brOdigranihPartija, int brPobedjenihPartija) {
        super(ime, nivo, brOdigranihPartija, brPobedjenihPartija);
    }

    public void setIzabranoSlovo(char izabranoSlovo) {
        if (Character.isAlphabetic(izabranoSlovo))
            this.izabranoSlovo = izabranoSlovo;
    }

    @Override
    public char odaberiSlovo(Rec trazenaRec) {
        return izabranoSlovo;
    }
}
