package Exercicio_5;

public class Boleto extends Pagamento {
    public Boleto(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        taxa = valor * (1.0/100);

        System.out.printf("Boleto de R$%.2f gerado com sucesso (Taxa: R$%.2f)\n", valor, taxa);
    }
}
