package Exercicio_7;

public class Reserva {
    private String data;
    private int quantidadePessoas;

    public void reservar(){
        System.out.println("Reserva realizada\n");
    }

    public void reservar(String data) {
        System.out.println("Reserva feita para o dia " + data + "\n");
    }

    public void reservar(String data, int quantidadePessoas){
        System.out.println("Reserva feita para o dia " + data + " para " + quantidadePessoas + " pessoas\n");
    }
}
