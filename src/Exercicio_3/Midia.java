package Exercicio_3;

public class Midia {
    protected  String titulo;
    protected int ano;

    public Midia(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public String geraCodigo() {
        String parte = titulo.substring(0, 3);
        return "LIB-" + parte.toUpperCase() + ano;
    }

    public void exibirInfo() {
        System.out.println("Código:" + geraCodigo());
    }

}
