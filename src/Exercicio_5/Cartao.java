package Exercicio_5;

public class Cartao extends Pagamento{
    public Cartao(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        taxa = valor * (3.0/100);

        System.out.printf("Pagamento de R$%.2f confirmado no Cartão de Crédito (Taxa: R$%.2f)\n", valor, taxa);
    }
}
