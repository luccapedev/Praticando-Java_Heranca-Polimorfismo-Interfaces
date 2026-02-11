package Exercicio_6;

public class Mensagem {
    private String mensagem;
    private String contato;

    public void enviarMensagem(String mensagem) {
        System.out.printf("Mensagem enviada para todos: %s\n", mensagem);
    }

    public void enviarMensagem(String contato, String mensagem) {
        System.out.printf("Mensagem para %s: %s\n", contato, mensagem);
    }
}
