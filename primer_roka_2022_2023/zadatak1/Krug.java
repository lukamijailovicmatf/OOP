package zadatak1;

public class Krug extends GeometrijskaFigura {

    // dodatni atribut kruga je njegov poluprecnik
    private double poluprecnik;

    // konstruktor za krug
    public Krug(String ime, double poluprecnik) {
        // poziva se konstruktor iz nadklase
        super(ime);
        this.poluprecnik = poluprecnik;
    }

    @Override
    public double povrsina() {
        return poluprecnik * poluprecnik * Math.PI;
    }

    @Override
    public void prikazi() {
        System.out.println("Krug " + ime + " sa poluprecnikom " + poluprecnik);
    }
}
