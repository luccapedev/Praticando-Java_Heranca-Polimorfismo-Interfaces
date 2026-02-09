import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String menu = "Digite o número da funcionalidade que deseja testar:\n" +
                "1 - \n" +
                "2 - \n" +
                "3 - \n" +
                "4 - \n" +
                "5 - \n" +
                "6 - \n" +
                "7 - \n" +
                "8 - \n" +
                "9 - \n" +
                "10 - \n" +
                "0 - Sair";

        System.out.println(menu);

        int escolha = -1;

        while (escolha != 0) {

            System.out.println(menu);
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Essa funcionalidade não existe ainda!");
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
