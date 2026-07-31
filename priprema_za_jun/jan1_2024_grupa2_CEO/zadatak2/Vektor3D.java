package org.example.jan1_2024_grupa2_ceo.zadatak2;

public class Vektor3D {

    private double x;
    private double y;
    private double z;

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
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        Vektor3D vektor = (Vektor3D) obj;
        return Double.compare(vektor.x, x) == 0 && Double.compare(vektor.y, y) == 0 && Double.compare(vektor.z, z) == 0;
    }

    // predefinisana metoda za ispis vektora
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
