package Exercicio_3;

public class Livro extends Midia{
    private String autor;

    public Livro(String titulo, int ano, String autor) {
        super(titulo, ano);
        this.autor = autor;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Código: " + geraCodigo() + " | Livro: " + titulo + " - Autor: " + autor);
    }
}
