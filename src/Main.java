import Exercicio_1.Aluno;
import Exercicio_1.Bolsista;
import Exercicio_2.Docente;
import Exercicio_2.Estudante;
import Exercicio_3.Ebook;
import Exercicio_3.Livro;
import Exercicio_3.Revista;
import Exercicio_4.Email;
import Exercicio_4.Push;
import Exercicio_4.SMS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String menu = "Digite o número da funcionalidade que deseja testar:\n" +
                "1 - Identificando o estudante\n" +
                "2 - Sistema escolar\n" +
                "3 - Gerenciamento de biblioteca\n" +
                "4 - Sistema de notificação\n" +
                "5 - Sistema de pagamentos\n" +
                "6 - Enviando mensagens\n" +
                "7 - Controle de reservas\n" +
                "8 - Implementando uma interface\n" +
                "9 - Sistema bancário\n" +
                "10 - Controle de dispositivos\n" +
                "0 - Sair";

        System.out.println(menu);

        int escolha = -1;

        while (escolha != 0) {

            System.out.println(menu);
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Digite o nome do primeiro aluno: ");
                    String nome = scanner.nextLine();

                    System.out.println("Digite o tipo do primeiro aluno: ");
                    String tipo = scanner.nextLine();
                    Aluno aluno1 = new Aluno(nome, tipo);

                    System.out.println("Digite o nome do aluno bolsista: ");
                    nome = scanner.nextLine();

                    Bolsista aluno2 = new Bolsista(nome);

                    aluno1.identificar();
                    aluno2.identificar();
                    break;
                case 2:
                    String disciplina;
                    int idade;
                    double nota;

                    scanner.nextLine();
                    System.out.println("Digite o nome do primeiro aluno: ");
                    nome = scanner.nextLine();
                    System.out.println("Digite a idade do primeiro aluno: ");
                    idade = scanner.nextInt();
                    System.out.println("Digite a nota do primeiro aluno: ");
                    nota = scanner.nextDouble();
                    Estudante estudante1 = new Estudante(nome,idade,nota);

                    scanner.nextLine();
                    System.out.println("Digite o nome do segundo aluno: ");
                    nome = scanner.nextLine();
                    System.out.println("Digite a idade do segundo aluno: ");
                    idade = scanner.nextInt();
                    System.out.println("Digite a nota do segundo aluno: ");
                    nota = scanner.nextDouble();
                    Estudante estudante2 = new Estudante(nome,idade,nota);

                    scanner.nextLine();
                    System.out.println("Digite o nome do primeiro docente: ");
                    nome = scanner.nextLine();
                    System.out.println("Digite a idade do primeiro docente: ");
                    idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite a disciplina do primeiro docente: ");
                    disciplina = scanner.nextLine();
                    Docente docente1 = new Docente(nome,idade,disciplina);

                    System.out.println("Digite o nome do segundo docente: ");
                    nome = scanner.nextLine();
                    System.out.println("Digite a idade do segundo docente: ");
                    idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite a disciplina do segundo docente: ");
                    disciplina = scanner.nextLine();
                    Docente docente2 = new Docente(nome,idade,disciplina);

                    estudante1.exibirDados();
                    estudante2.exibirDados();
                    docente1.exibirDados();
                    docente2.exibirDados();
                    break;
                case 3:
                    String titulo;
                    int ano;

                    scanner.nextLine();
                    System.out.println("Digite o nome do livro: ");
                    titulo = scanner.nextLine();

                    System.out.println("Digite o ano de publicação do livro: ");
                    ano = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    Livro livro = new Livro(titulo, ano, autor);


                    System.out.println("Digite o nome do ebook: ");
                    titulo = scanner.nextLine();

                    System.out.println("Digite o ano de publicação do ebook: ");
                    ano = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o formato do ebook: ");
                    String formato = scanner.nextLine();
                    Ebook ebook = new Ebook(titulo, ano, formato);


                    System.out.println("Digite o nome da revista: ");
                    titulo = scanner.nextLine();

                    System.out.println("Digite o ano de publicação da revista: ");
                    ano = scanner.nextInt();

                    System.out.println("Digite a edição da revista: ");
                    int edicao = scanner.nextInt();
                    scanner.nextLine();

                    Revista revista = new Revista(titulo, ano, edicao);

                    livro.exibirInfo();
                    ebook.exibirInfo();
                    revista.exibirInfo();
                    break;
                case 4:
                    String destinatario;
                    String mensagem;

                    scanner.nextLine();
                    System.out.println("Digite o email do destinatário: ");
                    destinatario = scanner.nextLine();

                    System.out.println("Digite o assunto do email: ");
                    String assunto = scanner.nextLine();

                    System.out.println("Digite o corpo do email: ");
                    mensagem = scanner.nextLine();

                    Email email = new Email(destinatario, assunto, mensagem);

                    System.out.println("Digite o número do destinatário: ");
                    destinatario = scanner.nextLine();

                    System.out.println("Digite a mensagem do SMS: ");
                    mensagem = scanner.nextLine();

                    SMS sms = new SMS(destinatario, mensagem);

                    System.out.println("Digite o usuário do destinatário: ");
                    destinatario = scanner.nextLine();

                    System.out.println("Digite o título do push:");
                    String tituloPush = scanner.nextLine();

                    System.out.println("Digite o conteúdo do push: ");
                    mensagem = scanner.nextLine();

                    Push push = new Push(destinatario, mensagem, tituloPush);

                    email.enviar();
                    sms.enviar();
                    push.enviar();
                    break;
                case 5:
                    System.out.println("Essa funcionalidade não existe ainda!");
                    break;
                case 6:
                    System.out.println("Essa funcionalidade não existe ainda!");
                    break;
                case 7:
                    System.out.println("Essa funcionalidade não existe ainda!");
                    break;
                case 8:
                    System.out.println("Essa funcionalidade não existe ainda!");
                    break;
                case 9:
                    System.out.println("Essa funcionalidade não existe ainda!");
                    break;
                case 10:
                    System.out.println("Essa funcionalidade não existe ainda!");
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Não existe nenhuma funcionalidade com esse número!");
            }
        }

        scanner.close();
    }
}
