package Exercicio_5;

public abstract class Pagamento {
    protected double valor;
    protected double taxa;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public abstract void confirmarPagamento();
}
