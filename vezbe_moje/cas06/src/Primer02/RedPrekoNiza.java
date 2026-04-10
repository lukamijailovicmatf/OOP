package Primer02;

public class RedPrekoNiza implements Red{

    private final int[] elementi;
    private final int kapacitet;
    private int pocetak;
    private int kraj;
    private int brojElemenata;

    public RedPrekoNiza(int kapacitet){
        this.kapacitet = kapacitet;
        this.elementi = new int[kapacitet];
        this.pocetak = 0;
        this.kraj = 0;
        this.brojElemenata = 0;
    }

    public void add(int x){
        // metod koji dodaje element na kraj reda
        if(kapacitet == size()){
            System.err.println("prekoracenje");
            return;
        }

        // dodajemo element x na kraj reda
        elementi[kraj] = x;
        // ovo radimo zbog ciklicnog pomeranja
        kraj = (kraj + 1) % kapacitet;
        // uvecavamo broj elemenata u redu
        brojElemenata++;
    }

    public void remove(){
        // metod koji skida element sa pocetka reda
        if(size() == 0){
            System.err.println("potkoracenje");
            return;
        }

        // ovo radimo zbog ciklicnog pomeranja
        pocetak = (pocetak + 1) % kapacitet;
        // smanjujemo broj elemenata u redu
        brojElemenata--;
    }

    public int head(){
        // metod koji vraca element sa pocetka reda
        if(size() == 0){
            System.err.println("potkoracenje");
            return Integer.MIN_VALUE;
        }

        // vrati mi element koji se nalazi na pocetku reda
        return elementi[pocetak];
    }

    public int back(){
        // metod koji vraca element sa kraja reda
        if(size() == 0){
            System.err.println("potkoracenje");
            return Integer.MIN_VALUE;
        }

        // vrati mi element koji se nalazi na kraju reda sa tim sto treba da vodis racuna o promeni kraja
        // samog reda
        return elementi[(kraj - 1) % kapacitet];
    }

    public int size(){
        // velicina reda zavisi direktno od broja elemenata koji se u njemu nalaze
        return brojElemenata;
    }

    public void show(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");

        for(int i = 0; i < size(); i++){
            sb.append(elementi[(i + pocetak) % kapacitet]).append(" ");
        }
        sb.append("]");

        // vrati mi toString nad sb tj. nad StringBuilder-om
        return sb.toString();
    }
}
