package Exercicio_4;

public class SMS extends Notificacao{
    public SMS(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public void enviar(){
        System.out.printf("Enviando SMS para: %s\nMensagem: %s\n", destinatario, mensagem);
    }
}
