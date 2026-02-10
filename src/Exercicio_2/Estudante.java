package Exercicio_2;

public class Estudante extends Pessoa {
    private double nota;

    public Estudante(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = nota;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Aluno: %s - Idade: %d - Nota: %.1f\n", nome, idade, nota);
    }
}
