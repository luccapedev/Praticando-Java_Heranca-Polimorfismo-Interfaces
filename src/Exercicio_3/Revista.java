package Exercicio_3;

public class Revista extends Midia{
    private int edicao;

    public Revista(String titulo, int ano, int edicao) {
        super(titulo, ano);
        this.edicao = edicao;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Código: " + geraCodigo() + " | Revista: " + titulo + " - Edição: " + edicao);
    }
}
