package Exercicio_7;

public class ReservaVip extends Reserva{
    @Override
    public void reservar() {
        System.out.println("Reserva VIP confirmada com atendimento exclusivo");
    }
}
