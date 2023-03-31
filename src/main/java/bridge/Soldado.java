package bridge;

public class Soldado extends Cargo{

    private int numAtribuicoes;

    public Soldado(float salarioBase) {
        super(salarioBase);
    }

    public void setNumAtribuicoes(int numAtribuicoes) {
        this.numAtribuicoes = numAtribuicoes;
    }

    public float calcularSalario() {
        return this.salarioBase * this.numAtribuicoes * (1 + this.escolaridade.percentualAumento());
    }
}
