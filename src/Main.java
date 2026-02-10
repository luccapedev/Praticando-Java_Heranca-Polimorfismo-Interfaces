import Classes.Aluno;
import Classes.Bolsista;

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
                    System.out.println("Essa funcionalidade não existe ainda!");
                    break;
                case 3:
                    System.out.println("Essa funcionalidade não existe ainda!");
                    break;
                case 4:
                    System.out.println("Essa funcionalidade não existe ainda!");
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
