package Exercicio_1;

public class Bolsista extends Aluno{

    public Bolsista(String nome) {
        super(nome, "bolsista");
    }

    @Override
    public void identificar() {
        System.out.printf("Aluno: %s - Tipo: %s\n", nome, tipo);
    }
}
