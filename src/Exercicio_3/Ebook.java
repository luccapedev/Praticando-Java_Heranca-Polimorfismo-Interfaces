package Exercicio_3;

public class Ebook extends Midia{
    private String formato;

    public Ebook(String titulo, int ano, String formato) {
        super(titulo, ano);
        this.formato = formato;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Código: " + geraCodigo() + " | Ebook: " + titulo + " - Formato: " + formato);
    }
}
