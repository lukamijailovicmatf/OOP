package Primer02;

public class Razlika extends BinarniIzraz{

    public Razlika(Izraz levi, Izraz desni){
        // Poziva konstruktor nadklase: BinarniIzraz(Izraz levi, Izraz desni);
        super(levi, desni);
    }

    @Override
    public double izracunaj() {
        return getLevi().izracunaj() - getDesni().izracunaj();
    }

    @Override
    public Izraz klon() {
        // Pozivamo metod get..(...).klon() jer pravimo klon objekta za klasu Razlika
        return new Razlika(getLevi().klon(), getDesni().klon());
    }

    @Override
    public String toString() {
        return "(" + getLevi() + ")" + " - " + "(" + getDesni() + ")";
    }
}
