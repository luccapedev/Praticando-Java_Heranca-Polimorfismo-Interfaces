package Exercicio_4;

public class Email extends Notificacao{
    private String assunto;

    public Email(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    @Override
    public void enviar(){
        System.out.printf("Enviando Email para: %s\nAssunto: %s\nCorpo: %s\n", destinatario, assunto, mensagem);
    }
}
