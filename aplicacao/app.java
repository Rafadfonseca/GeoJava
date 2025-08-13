package aplicacao;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma operação:");
        System.out.println("1. Geometria plana");
        System.out.println("2. Geometria espacial");

        int escolha = scanner.nextInt();


        switch (escolha) {
            case 1:
                resultado = n1 + n2;
                break;
            case 2:
                resultado = n1 - n2;
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        scanner.close();
    }
}