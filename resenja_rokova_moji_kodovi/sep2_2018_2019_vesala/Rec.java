package vesala;

import java.util.ArrayList;
import java.util.List;

public class Rec {

    private String rec; // rec koja se trazi
    private String nagovestaj;
    private List<Character> isprobanaSlova; // sva isprobana slova za datu rec
    private int tezina; // procenjena tezina pronalaska reci

    private static int tezinaReci(String rec) {
        // procenatSuglasnikaUReci * (1-(duzinaReci/(duzinaReci + 10)))
        long brSuglasnika = rec.toLowerCase().trim().chars()
                .filter(ch -> ch >= 'a' && ch <= 'z')
                .filter(ch -> ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
                .count();

        double procenatSuglasnika = brSuglasnika / (double)rec.length();
        System.out.println(procenatSuglasnika);
        double tezinaProcenat = procenatSuglasnika * (1 - ((double)rec.length() / (rec.length() + 10)));

        if (tezinaProcenat < 0.333) {
            return 1;
        } else if (tezinaProcenat < 0.666) {
            return 2;
        } else {
            return 3;
        }
    }

    public Rec(String rec) {
        this.rec = rec;
        this.isprobanaSlova = new ArrayList<>();
        this.tezina = tezinaReci(rec);
    }

    public Rec(String rec, String nagovestaj) {
        this.rec = rec;
        this.nagovestaj = nagovestaj;
        this.isprobanaSlova = new ArrayList<>();
        this.tezina = tezinaReci(rec);
    }

    public String getRec() {
        return rec;
    }

    public String getNagovestaj() {
        return nagovestaj;
    }

    public List<Character> getIsprobanaSlova() {
        return isprobanaSlova;
    }

    public int getTezina() {
        return tezina;
    }

    public String pogodjenaSlovaReci() {
        // kopiramo originalnu rec u pomocni niz char-ova i onda sa kopijom radimo
        char[] recCopy = rec.toCharArray();

        for (int i = 0; i < recCopy.length; i++) {
            if (!(isprobanaSlova.contains(recCopy[i])))
                recCopy[i] = '_';
        }
        return String.valueOf(recCopy);
    }

    public void setRec(String rec) {
        this.rec = rec;
    }

    public void setNagovestaj(String nagovestaj) {
        this.nagovestaj = nagovestaj;
    }

    public void dodajIsprobanoSlovo(char ch) {
        isprobanaSlova.add(ch);
    }

    @Override
    public String toString() {
        return rec + ", " + tezina;
    }
}
