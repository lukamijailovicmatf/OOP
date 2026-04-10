package zadatak1;

public class Kvadrat extends GeometrijskaFigura {

    // dodatni atribut kvadrata je njegova duzina stranice
    private double duzinaStranice;

    // konstruktor za kvadrat
    public Kvadrat(String ime, double duzinaStranice) {
        // poziva se konstruktor iz nadklase
        super(ime);
        this.duzinaStranice = duzinaStranice;
    }

    @Override
    public double povrsina() {
        return duzinaStranice * duzinaStranice;
    }

    @Override
    public void prikazi() {
        System.out.println("Kvadrat " + ime + " sa duzinom stranice " + duzinaStranice);
    }
}
