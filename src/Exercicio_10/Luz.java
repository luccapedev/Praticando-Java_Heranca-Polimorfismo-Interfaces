package Exercicio_10;

public class Luz implements Controlavel {
    private boolean isLigado;

    @Override
    public void ligar() {
        if (isLigado) {
            System.out.println("Luz já está ligada.");
        } else {
            isLigado = true;
            System.out.println("Luz ligada.");
        }
    }

    @Override
    public void desligar() {
        if (!isLigado) {
            System.out.println("Luz já está desligada.");
        } else {
            isLigado = false;
            System.out.println("Luz desligada.");
        }
    }
}
