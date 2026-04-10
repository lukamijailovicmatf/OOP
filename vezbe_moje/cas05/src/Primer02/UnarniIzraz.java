package Primer02;

public abstract class UnarniIzraz extends Izraz{

    // privatno polje za operand unarnog izraza (unarni plus/minus, ...)
    private Izraz operand;

    public UnarniIzraz(Izraz operand){
        this.operand = operand.klon();
    }

    public Izraz getOperand(){
        return operand;
    }
}
