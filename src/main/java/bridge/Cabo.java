package bridge;

public class Cabo extends Cargo {

    public Cabo(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase;
    }
}
