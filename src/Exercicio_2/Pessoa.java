package Exercicio_2;

public class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.printf("Pessoa: %s - Idade: %d\n", nome, idade);
    }
}
