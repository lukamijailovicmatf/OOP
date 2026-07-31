package zadatak2;

public class Vektor3D {

    private double x;
    private double y;
    private double z;

    // konstruktor
    public Vektor3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    // predefinisana metoda equals za poredjenje vektora
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Vektor3D vektor3D = (Vektor3D) obj;
        return Double.compare(vektor3D.x, x) == 0 && Double.compare(vektor3D.y, y) == 0 && Double.compare(vektor3D.z, z) == 0;
    }

    // predefinisana metoda za ispis vektora
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
