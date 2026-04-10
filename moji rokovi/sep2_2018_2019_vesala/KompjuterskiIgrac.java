package vesala;

import java.util.List;
import java.util.Random;

public class KompjuterskiIgrac extends Igrac {

    private Random random;

    public KompjuterskiIgrac(String ime, int nivo, int brOgigranihPartija, int brPObedjenihPartija) {
        super(ime, nivo, brOgigranihPartija, brPObedjenihPartija);
        this.random = new Random();
    }

    public char odaberiSlovo(Rec trazenaRec) {
        while (true) {
            char slovo = (char)('a' + random.nextInt(26));
            if (!trazenaRec.getIsprobanaSlova().contains(slovo))
                return slovo;
        }
    }

    public char odaberiSlovoPametno(Rec trazenaRec, List<Rec> recnik) {

    }
}
