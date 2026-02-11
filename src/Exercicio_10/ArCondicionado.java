package Exercicio_10;

public class ArCondicionado implements Controlavel {
    private boolean isLigado;

    @Override
    public void ligar() {
        if (isLigado) {
            System.out.println("Ar-condicionado já está ligado.");
        } else {
            isLigado = true;
            System.out.println("Ar-condicionado ligado.");
        }
    }

    @Override
    public void desligar() {
        if (!isLigado) {
            System.out.println("Ar-condicionado já está desligado.");
        } else {
            isLigado = false;
            System.out.println("Ar-condicionado desligado.");
        }
    }
}
