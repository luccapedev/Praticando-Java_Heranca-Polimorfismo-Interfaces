package Exercicio_4;

public class Push extends Notificacao {
    private String titulo;

    public Push(String destinatario, String mensagem, String titulo) {
        super(destinatario, mensagem);
        this.titulo = titulo;
    }

    @Override
    public void enviar(){
        System.out.printf("Enviando Push para: %s\nTítulo: %s\nConteúdo: %s\n", destinatario, titulo, mensagem);
    }
}
